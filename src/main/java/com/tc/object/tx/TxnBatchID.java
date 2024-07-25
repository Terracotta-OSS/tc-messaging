/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.tx;

import com.tc.util.AbstractIdentifier;

/**
 * Transaction batch identifier
 */
public class TxnBatchID extends AbstractIdentifier {

  public static final TxnBatchID NULL_BATCH_ID = new TxnBatchID();

  private TxnBatchID() {
    super();
  }
  
  public TxnBatchID(long batchID) {
    super(batchID);
  }

  @Override
  public String getIdentifierType() {
    return "TxnBatchID";
  }

}
