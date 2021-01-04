//Business place

package com.cheapestcarservicenearme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Shop {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private String id;
  private String name;
  private String address;
  private String phoneNumber;

  @OneToMany
  List<VehicleService> shopServiceIdList;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public List<VehicleService> getShopServiceIdList() {
	return shopServiceIdList;
}

public void setShopServiceIdList(List<VehicleService> shopServiceIdList) {
	this.shopServiceIdList = shopServiceIdList;
}
 
}
