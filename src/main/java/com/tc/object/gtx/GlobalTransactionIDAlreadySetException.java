/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.gtx;

public class GlobalTransactionIDAlreadySetException extends Exception {

  public GlobalTransactionIDAlreadySetException(String msg) {
    super(msg);
  }

}
