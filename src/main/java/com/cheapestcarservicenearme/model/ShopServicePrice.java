
package com.cheapestcarservicenearme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ShopServicePrice {
  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  private String id;
  private Double servicePrice;

  @OneToMany
  private Shop shopId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Double getServicePrice() {
    return servicePrice;
  }

  public void setServicePrice(Double servicePrice) {
    this.servicePrice = servicePrice;
  }

  public Shop getShopId() {
    return shopId;
  }

  public void setShopId(Shop shopId) {
    this.shopId = shopId;
  }
}