//Business place

package com.cheapestcarservicenearme.model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.CascadeType;
import javax.persistence.MapKey;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import java.util.List;
import org.hibernate.annotations.GenericGenerator;
import java.util.Map;

@Entity
public class Shop {
  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  private String id;
  private String name;
  private String address;
  private String phoneNumber;
  
// //shop service and a price
//   @OneToMany(cascade = CascadeType.ALL)
//   @JoinTable(name = "vehicle_service", 
//     joinColumns = {@JoinColumn(name = "service_id", referencedColumnName = "id")},
//     inverseJoinColumns = {@JoinColumn(name = "service_price_map_id", referencedColumnName = "id")})
//   @MapKey(name = "serviceName")
//   private Map<VehicleService, Double> servicePriceMap;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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


 
}
