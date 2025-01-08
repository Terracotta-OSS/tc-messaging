/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.NodeID;

public interface KeysForOrphanedValuesMessageFactory {

  public KeysForOrphanedValuesMessage newKeysForOrphanedValuesMessage(NodeID nodeID);

}
