/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;

import java.util.Collection;

public interface KeysForOrphanedValuesMessage extends ClusterMetaDataMessage {

  public ObjectID getMapObjectID();

  public void setMapObjectID(ObjectID objectID);

  public Collection<ObjectID> getMapValueObjectIDs();

  public void setMapValueObjectIDs(Collection<ObjectID> objectIDs);
}
