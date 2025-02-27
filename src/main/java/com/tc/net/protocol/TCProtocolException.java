/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol;

import com.tc.exception.TCException;

/**
 * Thrown by protocol adaptors when a error is detected in the network stream
 * 
 * @author teck
 */
public class TCProtocolException extends TCException {

  public TCProtocolException() {
    super();
  }

  public TCProtocolException(String message) {
    super(message);
  }

  public TCProtocolException(Throwable cause) {
    super(cause);
  }

  public TCProtocolException(String message, Throwable cause) {
    super(message, cause);
  }

}
