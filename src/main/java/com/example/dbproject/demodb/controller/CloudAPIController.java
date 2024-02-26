package com.example.dbproject.demodb.controller;


import com.example.dbproject.demodb.model.CloudVendor;
import com.example.dbproject.demodb.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//The request mapping service will extend the required url to
//the current request url + "/cloudvendor"
@RestController
@RequestMapping("/Cloudvendor")
public class CloudAPIController {

//    Create an instance of service layer because controller layer interacts
//    with service layer.
    CloudVendorService cvs;

    public CloudAPIController(CloudVendorService cvs) {
        this.cvs = cvs;
    }

    @GetMapping("{VendorID}")
    public CloudVendor getDetailsOfVendor(@PathVariable("VendorID") String VendorID){
        return cvs.getCloudVendorDB(VendorID);
    }


    @GetMapping()
    public List<CloudVendor> getListOfDetailsOfVendor(){
        return cvs.getAllCloudVendorDB();
    }

    @PostMapping
    public String CreateNewVendor(@RequestBody CloudVendor cv){
        cvs.createCloudVendorDB(cv);
        return "The cloud vendor created sucessfully";
    }

    @PutMapping
    public String UpdateExistingVendor(@RequestBody CloudVendor cv){
        cvs.updateCloudVendorDB(cv);
        return "The cloud vendor has been updated sucessfully";
    }

    @DeleteMapping("{id}")
    public String DeleteVendor(@PathVariable("id") String id){
        cvs.deleteCloudVendorDB(id);
        return "The Cloud Vendor has been deleted sucessfully";
    }
}
