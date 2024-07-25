/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object;

import com.tc.net.ClientID;

import java.util.SortedSet;

public interface ObjectRequestContext {

  public ObjectRequestID getRequestID();

  public ClientID getClientID();

  public SortedSet<ObjectID> getRequestedObjectIDs();

  public int getRequestDepth();

}
