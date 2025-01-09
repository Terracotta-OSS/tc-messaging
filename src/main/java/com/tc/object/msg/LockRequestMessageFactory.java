/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.NodeID;

public interface LockRequestMessageFactory {
  public LockRequestMessage newLockRequestMessage(NodeID nodeID);
}
