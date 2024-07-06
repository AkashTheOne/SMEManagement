package com.akash.employeevendor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.akash.employeevendor.bean.CommonResponseBean;
import com.akash.employeevendor.bean.Employee;
import com.akash.employeevendor.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public ResponseEntity<CommonResponseBean> createEmployee(Employee employee) {
		CommonResponseBean commonResponseBean = new CommonResponseBean();
		commonResponseBean.setStatusCode(HttpStatus.OK.value());
		commonResponseBean.setStatus("Failed");
		try {
			boolean emailExists = employeeRepository.existsById(employee.getEmail());
			if (!emailExists) {
				commonResponseBean.setData(employeeRepository.save(employee));
				commonResponseBean.setStatus("Success");
			} else {
				commonResponseBean.setErrorMsg("Email id is already present...");
			}
		} catch (Exception e) {
			commonResponseBean.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return new ResponseEntity<>(commonResponseBean, HttpStatus.OK);
	}

	public ResponseEntity<CommonResponseBean> getAllEmployees() {
		CommonResponseBean commonResponseBean = new CommonResponseBean();
		commonResponseBean.setStatusCode(HttpStatus.OK.value());
		commonResponseBean.setStatus("Failed");
		
		try {
			commonResponseBean.setData(employeeRepository.findAll());
			commonResponseBean.setStatus("Success");
		}catch (Exception e) {
			commonResponseBean.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
		
		
		return new ResponseEntity<>(commonResponseBean, HttpStatus.OK);
	}

}
