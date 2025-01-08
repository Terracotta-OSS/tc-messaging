/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.exception;

/**
 * The base class for all runtime (non-checked) Terracotta exceptions. Normal production code should never catch this.
 */
public class TCRuntimeException extends RuntimeException {

  public TCRuntimeException() {
    super();
  }

  public TCRuntimeException(String message) {
    super(message);
  }

  public TCRuntimeException(Throwable cause) {
    super(cause);
  }

  public TCRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

}