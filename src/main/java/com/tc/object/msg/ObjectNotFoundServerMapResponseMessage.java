/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;
import com.tc.object.ServerMapRequestID;
import com.tc.object.ServerMapRequestType;

public interface ObjectNotFoundServerMapResponseMessage extends ServerMapResponseMessage {

  public void initialize(ObjectID mapID, ServerMapRequestID requestID, ServerMapRequestType type);

  public ServerMapRequestID getRequestID();

}
