/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.NodeID;

public interface CompletedTransactionLowWaterMarkMessageFactory {
  
  public CompletedTransactionLowWaterMarkMessage newCompletedTransactionLowWaterMarkMessage(NodeID remoteID);

}
