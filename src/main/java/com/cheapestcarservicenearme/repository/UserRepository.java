package com.cheapestcarservicenearme.repository;

import com.cheapestcarservicenearme.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
