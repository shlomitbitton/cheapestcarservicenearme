//Business place

package com.cheapestcarservicenearme.model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.CascadeType;
import javax.persistence.MapKey;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;
import java.util.Set;

@Entity
public class Shop {
  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  private String shopId;
  private String name;
  private String address;
  private String phoneNumber;

  @OneToMany(mappedBy = "shop")
  Set<ShopServicePrice> shopServicePrices;
  
// //shop service and a price
//   @OneToMany(cascade = CascadeType.ALL)
//   @JoinTable(name = "vehicle_service", 
//     joinColumns = {@JoinColumn(name = "service_id", referencedColumnName = "id")},
//     inverseJoinColumns = {@JoinColumn(name = "service_price_map_id", referencedColumnName = "id")})
//   @MapKey(name = "serviceName")
//   private Map<VehicleService, Double> servicePriceMap;



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

public Set<ShopServicePrice> getShopServicePrices() {
	return shopServicePrices;
}

public void setShopServicePrices(Set<ShopServicePrice> shopServicePrices) {
	this.shopServicePrices = shopServicePrices;
}

public String getShopId() {
	return shopId;
}

public void setShopId(String shopId) {
	this.shopId = shopId;
}


 
}
