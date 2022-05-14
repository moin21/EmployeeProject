package com.example.employeeproject.controller;

import com.example.employeeproject.entity.Employee;
import com.example.employeeproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping("/employee")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping()
    public Employee createUSer(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    @GetMapping()
    public List<Employee> createUSer(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Optional<Employee> createUSer(@PathVariable int id){
        return employeeService.getById(id);
    }
   @DeleteMapping("/{id}")
   public String deleteEmployee(@PathVariable int id){
        return employeeService.deleteById(id);
   }
}
