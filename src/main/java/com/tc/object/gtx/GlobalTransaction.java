/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.gtx;

import com.tc.util.SequenceID;

public interface GlobalTransaction {

  public void setGlobalTransactionID(GlobalTransactionID gid) throws GlobalTransactionIDAlreadySetException;

  public GlobalTransactionID getGlobalTransactionID();

  public SequenceID getClientSequenceID();
}
