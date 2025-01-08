/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
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
