package com.akash.employeevendor.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.employeevendor.bean.Vendor;
import com.akash.employeevendor.service.VendorService;

@RestController
@CrossOrigin
@RequestMapping("/api/vendors")
public class VendorController {

	@Autowired
	private VendorService vendorService;

	@PostMapping
	public Vendor createVendor(@RequestBody Vendor vendor) {
		try {
			return vendorService.createVendor(vendor);
		} catch (Exception ex) {
			throw new IllegalArgumentException("Vendor with this email already exists.");
		}
	}

	@GetMapping
	public Collection<Vendor> getAllVendors() {
		try {
			return vendorService.getAllVendors();
		}catch (Exception e) {
			throw new IllegalArgumentException("error to fetch the vendor");
		}
	}

}
