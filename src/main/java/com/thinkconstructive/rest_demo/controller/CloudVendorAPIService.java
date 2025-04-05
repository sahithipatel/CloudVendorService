package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController  // how string know that it is controller class we should annotation
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {


    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
                //new CloudVendor("C1","Vendor 1","Address 1","xxxxx");
    }
    @PostMapping
    public  String  createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "CloudVendor Created Successfully";

    }
    @PutMapping
    public String  updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Updated the values successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor=null;
        return "Deleted successfully";
    }



}
