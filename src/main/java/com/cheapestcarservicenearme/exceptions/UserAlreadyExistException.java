package com.cheapestcarservicenearme.exceptions;

public class UserAlreadyExistException extends RuntimeException {
  /**
   *
   */
  private static final long serialVersionUID = 7427726122256784436L;

  public UserAlreadyExistException(String message) {
    super(message);
  } 
}

