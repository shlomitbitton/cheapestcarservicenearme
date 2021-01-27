package com.cheapestcarservicenearme.controller;

import com.cheapestcarservicenearme.model.VehicleService;
import com.cheapestcarservicenearme.service.ProspectiveInquiryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class InquiryController {
  
  @Autowired
  private ProspectiveInquiryService prospectiveInquiryService;

  // @GetMapping("/findService")
  // public String findService(Model model, @ModelAttribute("serviceInquiry") ServiceInquiry serviceInquiry){
  //   model.addAttribute("serviceInquiry", shopService.getShopServices());
  //   return "findService";
  // }

 

  @GetMapping("/availableServices")
  public String listAvailableShopsForService(Model model, @ModelAttribute("serviceInquired") String vehicleService){
    model.addAttribute("serviceInquiry", prospectiveInquiryService.getAllShopsPriceListForASpecificService(vehicleService));
    return "availableServices";
  }


}
