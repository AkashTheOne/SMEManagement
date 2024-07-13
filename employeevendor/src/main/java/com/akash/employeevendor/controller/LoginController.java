package com.akash.employeevendor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.employeevendor.bean.CommonResponseBean;
import com.akash.employeevendor.bean.LoginBean;
import com.akash.employeevendor.service.LoginService;


@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class LoginController {
	
	@Autowired
	private LoginService service;

	@PostMapping("/login")
	public ResponseEntity<CommonResponseBean> login(@RequestBody LoginBean bean){
		ResponseEntity<CommonResponseBean> responseEntity;
		responseEntity = service.loginData(bean);
		return responseEntity;
	}
}
