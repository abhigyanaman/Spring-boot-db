package com.example.dbproject.demodb.repository;

import com.example.dbproject.demodb.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
//JpaRepository uses 2 parameters : 1. The model class. 2. The id parameter for that model
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
