/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.util;


/**
 * Assertion error thrown by {@link Assert}.
 */
public class TCAssertionError extends AssertionError {

  public TCAssertionError() {
    super();
  }

  public TCAssertionError(String message) {
    super(message);
  }

  public TCAssertionError(Throwable cause) {
    super(cause);
  }

  public TCAssertionError(String message, Throwable cause) {
    super(message);
    initCause(cause);
  }

}