package com.example.Day23.service;

import com.example.Day23.entity.Employee;
import com.example.Day23.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeImplementation implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return (Employee) employeeRepository.save(employee);
    }
}
