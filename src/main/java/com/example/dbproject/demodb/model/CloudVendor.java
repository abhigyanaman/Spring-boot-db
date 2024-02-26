package com.example.dbproject.demodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import javax.persistence.Entity;
@Entity
//@Table is used to provide a specific name to the table else the default class name will be used.
@Table(name = "Cloud_Vendor_Info")
public class CloudVendor {
//    Tell spring boot the ID feild for the table
    @Id

    private String VendorID;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhone;

    public String getVendorID() {
        return VendorID;
    }

    public void setVendorID(String vendorID) {
        VendorID = vendorID;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhone() {
        return VendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        VendorPhone = vendorPhone;
    }



//    Should have an empty constructor to the calling class

    public CloudVendor (){

    }


    public CloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorPhone) {
        VendorID = vendorID;
        VendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhone = vendorPhone;
    }


}
