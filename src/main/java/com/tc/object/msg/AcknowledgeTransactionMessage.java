/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.NodeID;
import com.tc.net.protocol.tcm.TCMessage;
import com.tc.object.tx.TransactionID;

public interface AcknowledgeTransactionMessage extends TCMessage {

  public void initialize(NodeID channelID, TransactionID txID);

  public NodeID getRequesterID();

  public TransactionID getRequestID();

}
