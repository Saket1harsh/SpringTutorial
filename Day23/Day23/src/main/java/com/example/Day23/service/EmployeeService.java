package com.example.Day23.service;

import com.example.Day23.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public Employee getEmployeeById(int id);
    public List<Employee> getAllEmployee();
    public Employee updateEmployee(int id,Employee employee);
    public void deleteEmployee(long id);
}
