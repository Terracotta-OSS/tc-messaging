/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.tx;

public interface TransactionCompleteListener {

  public void transactionComplete(TransactionID txnID);

  public void transactionAborted(TransactionID txnID);

}
