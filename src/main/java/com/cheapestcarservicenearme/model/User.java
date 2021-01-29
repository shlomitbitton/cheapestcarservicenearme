package com.cheapestcarservicenearme.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@DiscriminatorValue("user")// a user
public class User extends Prospective{
 
  @NotNull
  @NotEmpty
  @Size(min=6, message = "{username.cannot.be.less.than.six.characters}")
  private String userName; 

  @Pattern(regexp = "((?=.*[A-Z]).{6,10})", message = "Password must have one upper case, one lower case and should be between 6 and 10 characters")
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
