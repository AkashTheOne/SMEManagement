package com.akash.employeevendor.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.akash.employeevendor.bean.CommonResponseBean;
import com.akash.employeevendor.bean.LoginBean;
import com.akash.employeevendor.repo.LoginRepo;

@Service
public class LoginService {

	@Autowired
	private LoginRepo repo;

	public ResponseEntity<CommonResponseBean> loginData(LoginBean bean) {
		CommonResponseBean commonResponseBean = new CommonResponseBean();
		commonResponseBean.setStatus("Failed");
		try {
			Optional<LoginBean> byUsernameAndPassword = repo.findByUserNameAndPwd(bean.getUserName(), bean.getPwd());
			commonResponseBean.setData(byUsernameAndPassword.isPresent() ? true : false);
			commonResponseBean.setStatus("success");
			
		}catch (Exception e) {
			commonResponseBean.setErrorMsg("Error occured in LoginRepo :  loginData method ");
		}

		return new ResponseEntity<>(commonResponseBean, HttpStatus.OK);
	}
}
