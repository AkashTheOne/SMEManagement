package com.akash.employeevendor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.employeevendor.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
