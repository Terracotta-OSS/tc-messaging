/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;
import com.tc.object.ServerMapRequestID;

public interface GetAllSizeServerMapRequestMessage extends ServerMapRequestMessage {

  public void initializeGetAllSizeRequest(ServerMapRequestID requestID, ObjectID[] maps);

  public ServerMapRequestID getRequestID();

  public ObjectID[] getMaps();

}
