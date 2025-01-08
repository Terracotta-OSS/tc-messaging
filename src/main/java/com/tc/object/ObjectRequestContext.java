/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
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
