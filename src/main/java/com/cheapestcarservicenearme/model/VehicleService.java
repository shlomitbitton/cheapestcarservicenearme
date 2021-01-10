//List of services names  in general

package com.cheapestcarservicenearme.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class VehicleService {
 
  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  private String vehicleServiceId;
  private String serviceName;
  
  @OneToMany(mappedBy = "vehicleService")
  Set<ShopServicePrice> shopServicePrices;


  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public Set<ShopServicePrice> getShopServicePrices() {
    return shopServicePrices;
  }

  public void setShopServicePrices(Set<ShopServicePrice> shopServicePrices) {
    this.shopServicePrices = shopServicePrices;
  }

  public String getVehicleServiceId() {
    return vehicleServiceId;
  }

  public void setVehicleServiceId(String vehicleServiceId) {
    this.vehicleServiceId = vehicleServiceId;
  }


 }
