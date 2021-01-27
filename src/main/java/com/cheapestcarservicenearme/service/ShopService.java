package com.cheapestcarservicenearme.service;

import com.cheapestcarservicenearme.model.VehicleService;
import com.cheapestcarservicenearme.repository.ShopRepository;
import com.cheapestcarservicenearme.repository.VehicleServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {

  @Autowired
  private VehicleServiceRepository VehicleServiceRepository;
  @Autowired
  private ShopRepository shopRepository;


  public Iterable<VehicleService> getShopServices(){
    Iterable<VehicleService> allServicesAvailable= VehicleServiceRepository.findAll();
    return allServicesAvailable;
  }

  
}
