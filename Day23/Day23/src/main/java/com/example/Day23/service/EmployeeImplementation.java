package com.example.Day23.service;

import com.example.Day23.entity.Employee;
import com.example.Day23.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeImplementation implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public Employee createEmployee(Employee employee) {
        return (Employee) employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById((long) id).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee emp = employeeRepository.findById((long) id).get();

        if(Objects.nonNull(employee.getFirstName())&&
                !"".equalsIgnoreCase(employee.getFirstName())){
            emp.setFirstName(employee.getFirstName());
        }
        if(Objects.nonNull(employee.getLastName())&&
                !"".equalsIgnoreCase(employee.getLastName())){
            emp.setLastName(employee.getLastName());
        }
        if(Objects.nonNull(employee.getDepartment())&&
                !"".equalsIgnoreCase(employee.getDepartment())){
            emp.setDepartment(employee.getDepartment());
        }
        return employeeRepository.save(emp);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
