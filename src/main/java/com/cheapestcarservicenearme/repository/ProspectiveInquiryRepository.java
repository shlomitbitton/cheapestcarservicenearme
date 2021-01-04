package com.cheapestcarservicenearme.repository;

import com.cheapestcarservicenearme.model.ServiceInquiry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProspectiveInquiryRepository extends CrudRepository<ServiceInquiry, String> {
  
}
