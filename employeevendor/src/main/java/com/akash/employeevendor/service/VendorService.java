package com.akash.employeevendor.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.employeevendor.bean.Vendor;
import com.akash.employeevendor.repo.VendorRepository;

@Service
public class VendorService {

	@Autowired
    private VendorRepository vendorRepository;

    private final List<String> sentEmails = new ArrayList<>();

    public Vendor createVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public Collection<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
