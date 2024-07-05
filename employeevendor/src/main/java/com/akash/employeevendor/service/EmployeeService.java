package com.akash.employeevendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.employeevendor.bean.Employee;
import com.akash.employeevendor.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
    	System.out.println(employee);
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
