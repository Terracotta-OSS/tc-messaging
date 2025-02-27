/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.object.ObjectID;
import com.tc.object.ServerMapGetValueResponse;
import com.tc.object.dna.impl.ObjectStringSerializer;

import java.util.Collection;

public interface GetValueServerMapResponseMessage extends ServerMapResponseMessage {

  public void initializeGetValueResponse(ObjectID mapID, ObjectStringSerializer serializer, Collection<ServerMapGetValueResponse> responses);

  public Collection<ServerMapGetValueResponse> getGetValueResponses();

}
