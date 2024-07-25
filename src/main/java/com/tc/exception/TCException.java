/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.exception;


/**
 * The base class for all standard, checked Terracotta exceptions.
 */
public class TCException extends Exception {

  public TCException() {
    super();
  }

  public TCException(String message) {
    super(message);
  }

  public TCException(Throwable cause) {
    super(cause);
  }

  public TCException(String message, Throwable cause) {
    super(message, cause);
  }

}
