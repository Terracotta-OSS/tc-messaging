/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.abortable;

public class AbortedOperationException extends Exception {

  public AbortedOperationException() {
    super();
  }

  public AbortedOperationException(String message, Throwable cause) {
    super(message, cause);
  }

  public AbortedOperationException(String message) {
    super(message);
  }

  public AbortedOperationException(Throwable cause) {
    super(cause);
  }

}
