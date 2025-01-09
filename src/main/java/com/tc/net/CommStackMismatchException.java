/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net;

public class CommStackMismatchException extends Exception {

  public CommStackMismatchException(String msg) {
    super(msg);
  }
}
