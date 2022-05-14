package com.example.employeeproject.service;

import com.example.employeeproject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeService iEmployeeService;

    public Employee addEmployee(Employee employee) {
        Employee newEmployee = new Employee(employee);
        iEmployeeService.save(employee);
        employee.toString();
        return newEmployee;
    }

    public List<Employee> getAllEmployees() {
        return iEmployeeService.findAll();
    }
    public Optional<Employee> getById(int id) {
        return iEmployeeService.findById(id);
    }
}
