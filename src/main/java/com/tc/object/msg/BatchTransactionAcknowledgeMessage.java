/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.protocol.tcm.TCMessage;
import com.tc.object.tx.TxnBatchID;

public interface BatchTransactionAcknowledgeMessage extends TCMessage {

  public void initialize(TxnBatchID id);

  public TxnBatchID getBatchID();

}
