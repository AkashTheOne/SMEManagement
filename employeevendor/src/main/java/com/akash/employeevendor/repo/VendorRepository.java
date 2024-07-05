package com.akash.employeevendor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.employeevendor.bean.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, String> {

}
