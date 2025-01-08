/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net;

public class MaxConnectionsExceededException extends Exception {

  public MaxConnectionsExceededException(String msg) {
    super(msg);
  }
}
