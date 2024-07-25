/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;

import java.util.Set;

public interface NodesWithObjectsMessage extends ClusterMetaDataMessage {

  public Set<ObjectID> getObjectIDs();

  public void addObjectID(ObjectID objectID);

}
