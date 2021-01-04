package com.cheapestcarservicenearme.repository;

import com.cheapestcarservicenearme.model.VehicleService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleServiceRepository extends CrudRepository<VehicleService, String> {

}
