/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.protocol.tcm.TCMessage;
import com.tc.object.ObjectID;
import com.tc.object.ServerMapRequestType;

public interface ServerMapResponseMessage extends TCMessage {

  public ObjectID getMapID();

  public ServerMapRequestType getRequestType();

  @Override
  public void send();

}
