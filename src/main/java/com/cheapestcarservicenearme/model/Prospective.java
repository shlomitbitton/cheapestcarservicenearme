//Prospective customer

package com.cheapestcarservicenearme.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.DiscriminatorType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type", 
  discriminatorType = DiscriminatorType.STRING)
public class Prospective {
  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  private String prospectiveId;
  @NotNull
  @NotBlank
  @NotEmpty(message="First name cannot be empty")
  private String firstName;
  @NotNull(message= "Last name may not be empty")
  @NotBlank
  @NotEmpty(message="Last name cannot be empty")
  private String lastName;
  @NotNull
  @NotBlank
  @NotEmpty
  private String email;
 // private int serviceInquiryId;

//  @OneToMany
//  List<ServiceInquiry> serviceInquiryIdList;

 public Prospective(){
}

 public Prospective(String email, String firstName, String lastName){
   this.email=email;
   this.lastName=lastName;
   this.firstName=firstName;
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

 public String getProspectiveId() {
   return prospectiveId;
 }

 public void setProspectiveId(String prospectiveId) {
   this.prospectiveId = prospectiveId;
 }


 

  
}
