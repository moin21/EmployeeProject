package com.example.employeeproject.service;

import com.example.employeeproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeService extends JpaRepository<Employee, Integer> {

}
