/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.net.protocol.tcm.TCMessage;
import com.tc.object.tx.TxnBatchID;

public interface BatchTransactionAcknowledgeMessage extends TCMessage {

  public void initialize(TxnBatchID id);

  public TxnBatchID getBatchID();

}
