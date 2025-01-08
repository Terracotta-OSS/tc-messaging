/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;
import com.tc.object.ServerMapRequestID;

public interface GetAllSizeServerMapRequestMessage extends ServerMapRequestMessage {

  public void initializeGetAllSizeRequest(ServerMapRequestID requestID, ObjectID[] maps);

  public ServerMapRequestID getRequestID();

  public ObjectID[] getMaps();

}
