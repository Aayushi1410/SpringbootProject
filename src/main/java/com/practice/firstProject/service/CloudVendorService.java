package com.practice.firstProject.service;


import java.util.List;

import com.practice.firstProject.model.CloudVendor;


public interface CloudVendorService {
   public String createCloudVendor(CloudVendor cloudVendor);
   public String updateCloudVendor(CloudVendor cloudVendor);
   public String deleteCloudVendor(String Id);
   public CloudVendor getCloudVendor(String Id);
   public List<CloudVendor> getAllCloudVendors();
}
