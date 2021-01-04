package com.cheapestcarservicenearme.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.cheapestcarservicenearme.exceptions.UserAlreadyExistException;
import com.cheapestcarservicenearme.model.Prospective;
import com.cheapestcarservicenearme.model.ServiceInquiry;
import com.cheapestcarservicenearme.repository.ProspectiveInquiryRepository;
import com.cheapestcarservicenearme.repository.ProspectiveRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProspectiveController {
  
  @Autowired
  private ProspectiveRepository prospectiveRepository;
  @Autowired
	private ProspectiveInquiryRepository prospectiveInquiryRepository;

  @GetMapping("/findService")
  public String findService(Model model, @ModelAttribute("serviceInquiry") ServiceInquiry serviceInquiry){
    model.addAttribute("serviceInquiry", serviceInquiry.getListOfServices());
    return "findService.html";
  }


  @GetMapping("/")
  public String home(){
    System.out.println("I am at the home mapping");
    return "forward:/registration.html";
  }

  @GetMapping("/listOfShops")
  public String listOfShopsAvailableForService(){
    return "listOfShops.html";
  }

  @GetMapping("/registration")
  public String showRegistrationForm(WebRequest request, Model model) {
    Prospective prospective = new Prospective();
    model.addAttribute("prospective", prospective);
    return "registration";
  }
  @PostMapping("/registration")
  public String registerProspectiveAccount(@ModelAttribute("prospective") @Valid Prospective prospective,
  HttpServletRequest request, Errors errors) {
    ModelAndView mav= new ModelAndView();
    try{
      Prospective registered = prospectiveRepository.save(prospective);
    }catch(UserAlreadyExistException uaeEx) {
        mav.addObject("message", "An account for that username/email already exists.");
        return "login";
    }
    mav.addObject("successRegister", prospective); 
    return "findService.html";
  }
}
