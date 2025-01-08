/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.gtx;

import com.tc.util.SequenceID;

public interface GlobalTransaction {

  public void setGlobalTransactionID(GlobalTransactionID gid) throws GlobalTransactionIDAlreadySetException;

  public GlobalTransactionID getGlobalTransactionID();

  public SequenceID getClientSequenceID();
}
