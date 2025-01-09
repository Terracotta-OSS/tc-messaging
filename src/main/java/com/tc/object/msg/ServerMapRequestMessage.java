/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.ClientID;
import com.tc.net.protocol.tcm.MessageChannel;
import com.tc.net.protocol.tcm.TCMessage;
import com.tc.object.ServerMapRequestType;

public interface ServerMapRequestMessage extends TCMessage {

  @Override
  public void send();

  public ClientID getClientID();

  public ServerMapRequestType getRequestType();

  public int getRequestCount();
  
  @Override
  public MessageChannel getChannel();
}
