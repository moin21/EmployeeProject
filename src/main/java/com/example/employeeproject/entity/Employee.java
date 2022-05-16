package com.example.employeeproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Entity Class for Employee
 *
 * @Data - For Getters and Setters.
 * @AllArgsConstructor - For Constructor with all arguments.
 * @NoArgsConstructor - For Constructor with no arguments.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    /**
     * Id: Auto generated id by using id and Generated values Annotation.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String fullName;
    public String profilePic;
    public String gender;
    public String department;
    public int salary;
    public String mobileNumber;
    public LocalDate startDate;
    public String notes;

    /**
     * Constructor : Using employee object and Id
     *
     * @param id       - Id of employee
     * @param employee - employee object.
     */
    public Employee(int id, Employee employee) {
        this.id = id;
        this.fullName = employee.fullName;
        this.profilePic = employee.profilePic;
        this.gender = employee.gender;
        this.department = employee.department;
        this.mobileNumber = employee.mobileNumber;
        this.notes = employee.notes;
        this.salary = employee.salary;
        this.startDate = employee.startDate;
    }
}

