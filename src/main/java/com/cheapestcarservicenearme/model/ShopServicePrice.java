
package com.cheapestcarservicenearme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ShopServicePrice {
  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  private String shopServicePriceId;
  private Double servicePrice;

  @ManyToOne
  @JoinColumn(name = "shop_id")
  private Shop shop;

  @ManyToOne
  @JoinColumn(name = "vehicle_service_id")
  private VehicleService vehicleService;


  public Double getServicePrice() {
    return servicePrice;
  }

  public void setServicePrice(Double servicePrice) {
    this.servicePrice = servicePrice;
  }

  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  public VehicleService getVehicleService() {
    return vehicleService;
  }

  public void setVehicleService(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  public String getShopServicePriceId() {
    return shopServicePriceId;
  }

  public void setShopServicePriceId(String shopServicePriceId) {
    this.shopServicePriceId = shopServicePriceId;
  }

}