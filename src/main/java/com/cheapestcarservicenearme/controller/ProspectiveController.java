package com.cheapestcarservicenearme.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.cheapestcarservicenearme.exceptions.UserAlreadyExistException;
import com.cheapestcarservicenearme.model.Prospective;
import com.cheapestcarservicenearme.model.ServiceInquiry;
import com.cheapestcarservicenearme.model.VehicleService;
import com.cheapestcarservicenearme.service.ProspectiveService;
import com.cheapestcarservicenearme.service.ShopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProspectiveController {
  
  @Autowired
  private ProspectiveService prospectiveService;
  @Autowired
  private ShopService shopService;
  
  

  // @PostMapping("/findService")
  // public List<VehicleService>  getservicesInquired(@ModelAttribute("serviceInquiry") ServiceInquiry serviceInquiry){
  //   List<VehicleService> listOfInquiredServices = new ArrayList<VehicleService> ();
  //   listOfInquiredServices = serviceInquiry.setListOfServicesInquired();
  //   return listOfInquiredServices;
  // }

  @ModelAttribute("serviceInquiry")
  public List<VehicleService>  getServicesAvailable(){
    List<VehicleService> listOfInquiredServices = new ArrayList<VehicleService> ();
    return listOfInquiredServices;
  }

  @GetMapping("/")
  public String home(){
    System.out.println("I am at the home mapping");
    return "forward:/registration";
  }

  @GetMapping("/listOfShops")
  public String listOfShopsAvailableForService(){
    return "listOfShops";
  }

  @GetMapping("/registration")
  public String showRegistrationForm(Model model) {
    Prospective prospective = new Prospective();
    model.addAttribute("prospective", prospective);
    return "registration";
  }

  //Later on to add sending username and password to email address
  @PostMapping("/resigteredSuccessfully")
  public String registerProspectiveAccount(@Valid @ModelAttribute("prospective") Prospective prospective, BindingResult bindingResult, Model model) {
    // ModelAndView mav= new ModelAndView();
    if(bindingResult.hasErrors()){
      return "login";
    }
    else{
      prospectiveService.saveProspective(prospective);
    //   //Forward to page successfuly registered, please check youe emails for a username and a password
    }
    // try{
    //   // Prospective registered = 
    //   prospectiveService.saveProspective(prospective);
    // }catch(UserAlreadyExistException uaeEx) {
    //     mav.addObject("message", "An account for that username/email already exists.");
    //     return "login";
    // }
   // mav.addObject("successRegister", prospective); 
    return "resigteredSuccessfully";
  }
}
