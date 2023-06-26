package com.practice.firstProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.firstProject.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
