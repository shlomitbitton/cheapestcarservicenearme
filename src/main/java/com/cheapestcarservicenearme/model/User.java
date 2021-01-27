package com.cheapestcarservicenearme.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@DiscriminatorValue("user")// a user
public class User extends Prospective{
 
  @NotNull
  @NotEmpty
  private String userName; 

  @NotNull
  @NotEmpty
  private String password;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
