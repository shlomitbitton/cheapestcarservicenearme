package com.cheapestcarservicenearme.controller;

import javax.validation.Valid;

import com.cheapestcarservicenearme.model.User;
import com.cheapestcarservicenearme.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
  

  @Autowired
  private UserService userService;

  @GetMapping("/login")
  public String login(){
    System.out.println("Login page");
    return "login";
  }
//to fix
  @PostMapping("/findServiceForm")
  public String showFindServiceForm(@Valid @ModelAttribute("userName")String userName,@Valid @ModelAttribute("password")String password){
    Iterable<User> userList = userService.getAllUsers();
    for(User user :userList){
      if(userName.equals(user.getUserName()) && password.equals(user.getPassword())){
        return "findServiceForm";
      }
    }
    return "";
  }

}
