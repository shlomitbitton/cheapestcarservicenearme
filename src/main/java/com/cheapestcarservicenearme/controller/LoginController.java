package com.cheapestcarservicenearme.controller;

import javax.validation.Valid;

import com.cheapestcarservicenearme.model.User;
import com.cheapestcarservicenearme.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
  

  @Autowired
  private UserService userService;

  @GetMapping("/login")
  public String login(){
    System.out.println("Login page");
    return "login";
  }

  @GetMapping("/findServiceForm")
  public String loginToFindServiceForm(@Valid @RequestParam("userName")String userName, @Valid @RequestParam("password")String password, Model model){
      System.out.println("userName: " + userName + " password: " +password);
      Iterable<User> userList = userService.getAllUsers();
      for(User u :userList){
        if(userName.equals(u.getUserName()) && password.equals(u.getPassword())){
          return "findServiceForm";
        }
      }  
    return "login";
  }

}
