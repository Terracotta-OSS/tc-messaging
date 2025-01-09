/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;

import java.util.Set;

public interface NodesWithObjectsMessage extends ClusterMetaDataMessage {

  public Set<ObjectID> getObjectIDs();

  public void addObjectID(ObjectID objectID);

}
