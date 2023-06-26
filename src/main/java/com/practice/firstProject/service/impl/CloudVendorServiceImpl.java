package com.practice.firstProject.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.firstProject.exception.CloudVendorNotFoundException;
import com.practice.firstProject.model.CloudVendor;
import com.practice.firstProject.repository.CloudVendorRepository;
import com.practice.firstProject.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
	
	@Autowired
	CloudVendorRepository cloudVendorRepo;

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepo) {
		super();
		this.cloudVendorRepo = cloudVendorRepo;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepo.save(cloudVendor);
		return "Successfully created";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepo.save(cloudVendor);
		return "Successfully updated";
	}

	@Override
	public String deleteCloudVendor(String Id) {
		// TODO Auto-generated method stub
		cloudVendorRepo.deleteById(Id);
		return "Successfully deleted";
	}

	@Override
	public CloudVendor getCloudVendor(String Id) {
		// TODO Auto-generated method stub
		if(cloudVendorRepo.findById(Id).isEmpty()){
			throw new CloudVendorNotFoundException("Requested Vendor doesnot exist");
		}
		return cloudVendorRepo.findById(Id).get(); 
		
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		// TODO Auto-generated method stub
		return cloudVendorRepo.findAll();
	}

}
