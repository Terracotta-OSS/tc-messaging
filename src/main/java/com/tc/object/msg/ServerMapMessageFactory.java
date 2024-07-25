/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.net.NodeID;
import com.tc.object.ServerMapRequestType;

public interface ServerMapMessageFactory {

  public ServerMapRequestMessage newServerMapRequestMessage(NodeID nodeID, ServerMapRequestType type);

}
