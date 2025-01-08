/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
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
