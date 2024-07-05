package com.akash.employeevendor.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendors")
public class Vendor {
	
	@Id
    private String name;
    private String email;
    private String upi;
    
	public Vendor() {
		super();
	}

	public Vendor(String name, String email, String upi) {
		super();
		this.name = name;
		this.email = email;
		this.upi = upi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUpi() {
		return upi;
	}

	public void setUpi(String upi) {
		this.upi = upi;
	}

	@Override
	public String toString() {
		return "Vendor [name=" + name + ", email=" + email + ", upi=" + upi + "]";
	}
    
    
}
