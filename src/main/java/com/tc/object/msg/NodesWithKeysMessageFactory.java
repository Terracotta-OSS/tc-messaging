/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.net.NodeID;

/**
 * @author Alex Snaps
 */
public interface NodesWithKeysMessageFactory {

  public NodesWithKeysMessage newNodesWithKeysMessage(NodeID nodeID);

}
