/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.tx;

public interface TransactionCompleteListener {

  public void transactionComplete(TransactionID txnID);

  public void transactionAborted(TransactionID txnID);

}
