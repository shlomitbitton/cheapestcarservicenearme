// An inquiry will have  ids of services requested.

package com.cheapestcarservicenearme.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import java.util.List;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class ServiceInquiry {
  
  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  private String serviceInquiryId;
  private String location;


  @ManyToOne(fetch = FetchType.LAZY)
  private Prospective prospective;

  // @OneToMany
  // List<VehicleService> listOfServicesInquired;

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Prospective getProspective() {
    return prospective;
  }

  public void setProspective(Prospective prospective) {
    this.prospective = prospective;
  }

  public String getServiceInquiryId() {
    return serviceInquiryId;
  }

  public void setServiceInquiryId(String serviceInquiryId) {
    this.serviceInquiryId = serviceInquiryId;
  }

 

  
}
