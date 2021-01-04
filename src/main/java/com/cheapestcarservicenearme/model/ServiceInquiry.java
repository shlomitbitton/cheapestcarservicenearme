// An inquiry will have  ids of services requested.

package com.cheapestcarservicenearme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ServiceInquiry {
  
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private String id;
  private String location;

  @OneToMany
  List<VehicleService> listOfServices;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public List<VehicleService> getListOfServices() {
    return listOfServices;
  }

  public void setListOfServices(List<VehicleService> listOfServices) {
    this.listOfServices = listOfServices;
  }
}
