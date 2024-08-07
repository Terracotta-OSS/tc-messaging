/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
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
