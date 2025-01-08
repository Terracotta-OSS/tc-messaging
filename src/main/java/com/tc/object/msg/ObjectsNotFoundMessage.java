/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.protocol.tcm.TCMessage;

import java.util.Set;

public interface ObjectsNotFoundMessage extends TCMessage {

  public void initialize(Set missingObjectIDs, long batchId);

  public long getBatchID();

  public Set getMissingObjectIDs();

}
