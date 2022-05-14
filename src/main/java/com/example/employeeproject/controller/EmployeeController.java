package com.example.employeeproject.controller;

import com.example.employeeproject.entity.Employee;
import com.example.employeeproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/employee")
    public Employee createUSer(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    @GetMapping("/employee")
    public List<Employee> createUSer(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Optional<Employee> createUSer(@PathVariable int id){
        return employeeService.getById(id);
    }
}
