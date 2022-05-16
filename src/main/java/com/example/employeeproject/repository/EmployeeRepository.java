package com.example.employeeproject.repository;

import com.example.employeeproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface extending JpaRepository - EmployeeRepository
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
