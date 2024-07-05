package com.akash.employeevendor.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	private String email;
	private String name;
	private String designation;
	private String ctc;

	public Employee() {
		super();
	}

	public Employee(String email, String name, String designation, String ctc) {
		super();
		this.email = email;
		this.name = name;
		this.designation = designation;
		this.ctc = ctc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCtc() {
		return ctc;
	}

	public void setCtc(String ctc) {
		this.ctc = ctc;
	}

	@Override
	public String toString() {
		return "Employee [email=" + email + ", name=" + name + ", designation=" + designation + ", ctc=" + ctc + "]";
	}

}
