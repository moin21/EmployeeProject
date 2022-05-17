package com.example.employeeproject.service;

import com.example.employeeproject.dto.EmployeeDTO;
import com.example.employeeproject.entity.Employee;
import com.example.employeeproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service Class with IEmployeeService implementations.
 */
@Service
public class EmployeeService implements IEmployeeService {
    /**
     * Auto Wired EmployeeRepository - employeeRepository.
     */
    @Autowired
    EmployeeRepository employeeRepository;

    /**
     * Method to add employee to database.
     *
     * @param employee - employee object containing all required fields.
     * @return - implementation of save method from EmployeeRepository by passing employee object.
     */
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * Method to get all employees from database.
     *
     * @return - implementation of findAll method from EmployeeRepository.
     */
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * Method to get employees using Id from database.
     *
     * @param id - Id of employee required to get from database.
     * @return - implementation of findById method from EmployeeRepository.
     */
    public Optional<Employee> getById(int id) {
        return employeeRepository.findById(id);
    }

    /**
     * Method to delete employee using Id from Database.
     *
     * @param id - Id of employee required to delete from database.
     * @return - implementation of deleteById method from EmployeeRepository.
     */
    public String deleteById(int id) {
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.deleteById(id);
            return "Employee with ID: " + id + " is Deleted Successfully!!";
        } else return "No employee was found with given id.";
    }

    /**
     * Method to edit existing employee in database.
     * If there is a match by passed id, we create a new employee object using the same id - employee1.
     * Passing the object to the save method.
     *
     * @param employeeDTO - employee object with new field values.
     * @param id          - Id of employee required to delete from database.
     * @return - implementation of save method from EmployeeRepository.
     */
    public String editEmployee(EmployeeDTO employeeDTO, int id) {
        if (employeeRepository.findById(id).isPresent()) {
            Employee employee1 = new Employee(id, employeeDTO);
           Employee alpha = employeeRepository.save(employee1);
           return "This is the result"+ alpha;
        } else throw new RuntimeException();

    }
}
