// An inquiry will have  ids of services requested.

package com.cheapestcarservicenearme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class ServiceInquiry {
  
  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  private String id;
  private String location;

  @OneToMany
  List<VehicleService> listOfServicesInquired;

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

  public List<VehicleService> getListOfServicesInquired() {
    return listOfServicesInquired;
  }

  public void setListOfServicesInquired(List<VehicleService> listOfServicesInquired) {
    this.listOfServicesInquired = listOfServicesInquired;
  }

  
}
