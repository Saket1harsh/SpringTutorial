package com.example.Day23.Controller;

import com.example.Day23.entity.Employee;
import com.example.Day23.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/api/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/api/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/api/employee/{id}")
    public Employee getDepartmentById(@PathVariable("id") int id ){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/api/employee/{id}")
    public Employee updateDepartment(@PathVariable("id") int id,@RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/api/employee/{id}")
    public String deleteDepartmentById(@PathVariable("id") int id ){
        employeeService.deleteEmployee(id);
        return "Department deleted Successfully!!";
    }

}
