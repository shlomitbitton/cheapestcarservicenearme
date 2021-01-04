package com.cheapestcarservicenearme.service;

import java.util.Arrays;

import javax.transaction.Transactional;

import com.cheapestcarservicenearme.exceptions.UserAlreadyExistException;
import com.cheapestcarservicenearme.model.Prospective;
import com.cheapestcarservicenearme.repository.ProspectiveRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class ProspectiveService{


  @Autowired
  ProspectiveRepository prospectiveRepository;

  @Transactional
  // @Override
  public Prospective registerNewPropectiveAccount(String email, String firstName, String lastName) throws UserAlreadyExistException {
      if (emailExist(email)) {  
          throw new UserAlreadyExistException(
            "There is an account with that email address: "
            +  email);
      }
      Prospective newProspective = new Prospective(email, firstName, lastName);
      newProspective.setFirstName(firstName);
      newProspective.setLastName(lastName);
     // newProspective.setPassword(prospective.getPassword());
      newProspective.setEmail(email);
      return prospectiveRepository.save(newProspective);       
    }

  private boolean emailExist(String email) {
    return prospectiveRepository.findByEmail(email)!= null;
  }

  public Prospective loadProspectiveByUsername(String email)
      throws UsernameNotFoundException {
 
        Prospective prospective = prospectiveRepository.findByEmail(email);
        if (prospective == null) {
            throw new UsernameNotFoundException(
              "No user found with username: "+ email);
        }
        // boolean enabled = true;
        // boolean accountNonExpired = true;
        // boolean credentialsNonExpired = true;
        // boolean accountNonLocked = true;
        return prospective;
          // prospective.getPassword().toLowerCase(), enabled, accountNonExpired, 
          // credentialsNonExpired, accountNonLocked, 
          // getAuthorities(prospective.getRoles()));
    }
}
