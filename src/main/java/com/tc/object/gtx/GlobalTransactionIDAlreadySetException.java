/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.gtx;

public class GlobalTransactionIDAlreadySetException extends Exception {

  public GlobalTransactionIDAlreadySetException(String msg) {
    super(msg);
  }

}
