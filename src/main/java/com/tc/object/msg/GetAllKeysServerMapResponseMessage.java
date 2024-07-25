/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;
import com.tc.object.ServerMapRequestID;

import java.util.Set;

public interface GetAllKeysServerMapResponseMessage extends ServerMapResponseMessage {

  public ServerMapRequestID getRequestID();

  public Set getAllKeys();

  public void initializeGetAllKeysResponse(ObjectID mapID, ServerMapRequestID requestID, Set keys);

}
