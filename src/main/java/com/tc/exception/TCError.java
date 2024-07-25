/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.exception;


/**
 * The base class for all Terracotta errors.
 */
public class TCError extends Error {

  public TCError() {
    super();
  }

  public TCError(String message) {
    super(message);
  }

  public TCError(Throwable cause) {
    super(cause);
  }

  public TCError(String message, Throwable cause) {
    super(message, cause);
  }

}
