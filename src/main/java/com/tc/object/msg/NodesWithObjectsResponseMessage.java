/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.NodeID;
import com.tc.object.ObjectID;
import com.tc.object.locks.ThreadID;

import java.util.Map;
import java.util.Set;

public interface NodesWithObjectsResponseMessage extends ClusterMetaDataResponseMessage {

  public void initialize(ThreadID threadID, Map<ObjectID, Set<NodeID>> response);

  public Map<ObjectID, Set<NodeID>> getNodesWithObjects();

}
