/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.tx;

import com.tc.io.TCByteBufferOutputStream;

import java.util.List;

public interface TransactionBuffer {

  public void writeTo(TCByteBufferOutputStream dest);

  public int write(ClientTransaction txn);

  public int getTxnCount();

  public TransactionID getFoldedTransactionID();

  public void addTransactionCompleteListeners(List transactionCompleteListeners);

  public List getTransactionCompleteListeners();

}