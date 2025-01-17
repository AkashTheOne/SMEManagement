package com.akash.employeevendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.employeevendor.bean.CommonResponseBean;
import com.akash.employeevendor.bean.Employee;
import com.akash.employeevendor.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<CommonResponseBean> createEmployee(@RequestBody Employee employee) {
		ResponseEntity<CommonResponseBean> responseEntity;
		responseEntity = employeeService.createEmployee(employee);
		return responseEntity;
	}

	@GetMapping
	public ResponseEntity<CommonResponseBean> getAllEmployees() {
		ResponseEntity<CommonResponseBean> responseEntity;
		responseEntity = employeeService.getAllEmployees();
		return responseEntity;
	}

}
