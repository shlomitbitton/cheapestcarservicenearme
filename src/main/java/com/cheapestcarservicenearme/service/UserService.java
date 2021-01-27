package com.cheapestcarservicenearme.service;

import java.util.List;

import com.cheapestcarservicenearme.model.User;
import com.cheapestcarservicenearme.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;


  public Iterable<User> getAllUsers(){
    Iterable<User> userList = userRepository.findAll();
    return userList;
  }
  
}
