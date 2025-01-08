/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.NodeID;
import com.tc.object.ServerMapRequestType;

public interface ServerMapMessageFactory {

  public ServerMapRequestMessage newServerMapRequestMessage(NodeID nodeID, ServerMapRequestType type);

}
