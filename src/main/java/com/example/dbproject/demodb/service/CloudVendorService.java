package com.example.dbproject.demodb.service;

import com.example.dbproject.demodb.model.CloudVendor;

import java.util.List;

//This layer will contain the business logic or the service layer implementation
public interface CloudVendorService {
    public String createCloudVendorDB(CloudVendor c);
    public String updateCloudVendorDB(CloudVendor c);
    public String deleteCloudVendorDB(String id);
    public CloudVendor getCloudVendorDB(String id);
    public List<CloudVendor> getAllCloudVendorDB();
}
