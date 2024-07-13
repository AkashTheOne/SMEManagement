package com.akash.employeevendor.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.employeevendor.bean.LoginBean;

@Repository
public interface LoginRepo extends JpaRepository<LoginBean, Integer> {

	Optional<LoginBean> findByUserNameAndPwd(String userName, String pwd);
}
