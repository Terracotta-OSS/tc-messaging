/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net;

public class MaxConnectionsExceededException extends Exception {

  public MaxConnectionsExceededException(String msg) {
    super(msg);
  }
}
