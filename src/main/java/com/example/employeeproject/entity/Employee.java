package com.example.employeeproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    public String fullName;
    public String profilePic;
    public String salary;
    public String email;
    public String mobileNumber;
    public String startDate;
    /**
     * Employee Fields: id, firstName, lastName, salary, email, mobileNumber, startDate.
     */
    @Id
    @GeneratedValue
    public int id;

    public Employee(int id, String fullName, String profilePic, String salary, String email, String mobileNumber, String startDate) {
        this.id = id;
        this.fullName = fullName;
        this.profilePic = profilePic;
        this.salary = salary;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.startDate = startDate;
    }

    public Employee(Employee employee) {
        this.id = employee.id;
        this.fullName = employee.fullName;
        this.profilePic = employee.profilePic;
        this.salary = employee.salary;
        this.email = employee.email;
        this.mobileNumber = employee.mobileNumber;
        this.startDate = employee.startDate;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fullName='" + fullName + '\'' + ", profilePic='" + profilePic + '\'' + ", salary='" + salary + '\'' + ", email='" + email + '\'' + ", mobileNumber='" + mobileNumber + '\'' + ", startDate='" + startDate + '\'' + '}';
    }
}
