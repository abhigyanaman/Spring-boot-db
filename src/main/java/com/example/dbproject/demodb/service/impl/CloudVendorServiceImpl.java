package com.example.dbproject.demodb.service.impl;
//This keeps the details of the implementation of all the methods
//described in the service interface.

import com.example.dbproject.demodb.model.CloudVendor;
import com.example.dbproject.demodb.repository.CloudVendorRepository;
import com.example.dbproject.demodb.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
//    Firstly we need a instance of the repository layer because repository
//    is the layer talking to the database.
    CloudVendorRepository cvr;

    public CloudVendorServiceImpl(CloudVendorRepository cvr) {
        this.cvr = cvr;
    }


    @Override
    public String createCloudVendorDB(CloudVendor c) {
        cvr.save(c);
        return "Successfully Created the Cloud Vendor";
    }

    @Override
    public String updateCloudVendorDB(CloudVendor c) {
        cvr.save(c);
        return "Successfully Updated";
    }

    @Override
    public String deleteCloudVendorDB(String id) {
        cvr.deleteById(id);
        return "Delete Success for the provided id";
    }

    @Override
    public CloudVendor getCloudVendorDB(String id) {
        return cvr.findById(id).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendorDB() {
        return cvr.findAll();
    }
}
