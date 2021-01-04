//Prospective customer

package com.cheapestcarservicenearme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

// import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

@Entity
public class Prospective {
  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  private String id;
  @NotNull
  @NotBlank
  // @NotEmpty
  private String firstName;
  @NotNull
  @NotBlank
  // @NotEmpty
  private String lastName;
  @NotNull
  @NotBlank
  // @NotEmpty
  private String email;
 // private int serviceInquiryId;

 @OneToMany
 List<ServiceInquiry> serviceInquiryIdList;

 public Prospective(){
}

 public Prospective(String email, String firstName, String lastName){
   this.email=email;
   this.lastName=lastName;
   this.firstName=firstName;
 }


 public String getId() {
   return id;
 }

 public void setId(String id) {
   this.id = id;
 }

 public String getFirstName() {
   return firstName;
 }

 public void setFirstName(String firstName) {
   this.firstName = firstName;
 }

 public String getLastName() {
   return lastName;
 }

 public void setLastName(String lastName) {
   this.lastName = lastName;
 }

 public String getEmail() {
   return email;
 }

 public void setEmail(String email) {
   this.email = email;
 }

 public List<ServiceInquiry> getServiceInquiryIdList() {
   return serviceInquiryIdList;
 }

 public void setServiceInquiryIdList(List<ServiceInquiry> serviceInquiryIdList) {
   this.serviceInquiryIdList = serviceInquiryIdList;
 }

 

  
}
