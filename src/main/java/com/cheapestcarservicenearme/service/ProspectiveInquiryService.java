package com.cheapestcarservicenearme.service;

import com.cheapestcarservicenearme.repository.ProspectiveInquiryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProspectiveInquiryService {
  
  @Autowired
  private ProspectiveInquiryRepository prospectiveInquiryRepository;

}
