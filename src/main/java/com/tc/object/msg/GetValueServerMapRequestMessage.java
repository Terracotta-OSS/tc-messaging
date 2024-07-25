/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;
import com.tc.object.ServerMapGetValueRequest;
import com.tc.object.ServerMapRequestID;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface GetValueServerMapRequestMessage extends ServerMapRequestMessage {

  public void addGetValueRequestTo(ServerMapRequestID requestID, ObjectID mapID, Set<Object> portableKeys);

  public Map<ObjectID, Collection<ServerMapGetValueRequest>> getRequests();

}
