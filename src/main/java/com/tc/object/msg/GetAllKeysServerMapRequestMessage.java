/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;
import com.tc.object.ServerMapRequestID;

public interface GetAllKeysServerMapRequestMessage extends ServerMapRequestMessage {

  public void initializeSnapshotRequest(ServerMapRequestID requestID, ObjectID mapID);

  public ServerMapRequestID getRequestID();

  public ObjectID getMapID();

}
