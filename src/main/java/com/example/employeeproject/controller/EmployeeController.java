package com.example.employeeproject.controller;

import com.example.employeeproject.entity.Employee;
import com.example.employeeproject.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller Class - EmployeeController.
 * Base URL: localhost:8080/employee
 */
@RequestMapping("/employee")
@RestController
public class EmployeeController {
    /**
     * Dependency injection using Autowired - iEmployeeService.
     */
    @Autowired
    IEmployeeService iEmployeeService;

    /**
     * PostMapping method to create employee in database.
     * URL - /post
     *
     * @param employee - employee object to be provided in RequestBody.
     * @return - implementation of addEmployee method from IEmployeeService on employee object.
     */
    @PostMapping("/post")
    public Employee createEmployees(@RequestBody Employee employee) {
        return iEmployeeService.addEmployee(employee);
    }

    /**
     * GetMapping method to get all existing employees in database.
     * URL - /get-all
     *
     * @return - implementation of getAllEmployees method from IEmployeeService.
     */
    @GetMapping("/get-all")
    public List<Employee> getAllEmployees() {
        return iEmployeeService.getAllEmployees();
    }

    /**
     * GetMapping method to get specific employee by id.
     *
     * @param id - Id of existing employee that needs to be updated in path variable.
     * @return - implementation of getById method from IEmployeeService.
     */
    @GetMapping("get/{id}")
    public Optional<Employee> getByEmployee(@PathVariable int id) {
        return iEmployeeService.getById(id);
    }

    /**
     * DeleteMapping method to delete specific employee by id.
     *
     * @param id - Id of existing employee that needs to be deleted in path variable.
     * @return - implementation of deleteById method from IEmployeeService.
     */
    @DeleteMapping("delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return iEmployeeService.deleteById(id);
    }

    /**
     * PutMapping method to edit existing employee by id.
     *
     * @param employee - Employee object with new field values that need to be placed.
     * @param id       - Id of existing employee that needs to be updated in path variable.
     * @return - implementation of editEmployee method from IEmployeeService by passing Id and employee object.
     */
    @PutMapping("update/{id}")
    public Employee editEmployee(@RequestBody Employee employee, @PathVariable int id) {
        return iEmployeeService.editEmployee(employee, id);
    }
}
