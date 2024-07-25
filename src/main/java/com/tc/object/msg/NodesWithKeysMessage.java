/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;

import java.util.Set;

/**
 * @author Alex Snaps
 */
public interface NodesWithKeysMessage extends ClusterMetaDataMessage {

  public ObjectID getMapObjectID();

  public void setMapObjectID(ObjectID objectID);

  public void setKeys(Set<Object> keys);

  public Set<Object> getKeys();
  
}
