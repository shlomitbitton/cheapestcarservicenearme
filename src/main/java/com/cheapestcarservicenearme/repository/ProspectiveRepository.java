package com.cheapestcarservicenearme.repository;
import com.cheapestcarservicenearme.model.Prospective;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProspectiveRepository extends CrudRepository<Prospective, String> {
 // Prospective saveNewProspective();
  // Prospective registerNewUserAccount(Prospective prospective);
  Prospective findByEmail(String email);
  
}
