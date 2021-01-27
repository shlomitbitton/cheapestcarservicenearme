package com.cheapestcarservicenearme.repository;

import com.cheapestcarservicenearme.model.Shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends CrudRepository<Shop, String> {
  
}
