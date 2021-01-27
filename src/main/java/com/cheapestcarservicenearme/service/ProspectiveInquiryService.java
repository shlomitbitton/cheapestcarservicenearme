package com.cheapestcarservicenearme.service;

import java.util.ArrayList;

import com.cheapestcarservicenearme.model.Shop;
import com.cheapestcarservicenearme.repository.ProspectiveInquiryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProspectiveInquiryService {
  
  @Autowired
  private ProspectiveInquiryRepository prospectiveInquiryRepository;

  //Should return List of shops with the shop name, price, and address, and phone number
  public  ArrayList<ArrayList<Shop>> getAllShopsPriceListForASpecificService(String shopService){
    ArrayList<ArrayList<Shop>> shopList = new ArrayList<ArrayList<Shop>>();

    return shopList;
  }

}
