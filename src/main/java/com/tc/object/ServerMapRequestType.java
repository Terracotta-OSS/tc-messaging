/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object;

import com.tc.net.protocol.tcm.MessageChannel;
import com.tc.net.protocol.tcm.TCMessageType;
import com.tc.object.msg.ServerMapRequestMessage;

public enum ServerMapRequestType {
  GET_VALUE_FOR_KEY(TCMessageType.GET_VALUE_SERVER_MAP_REQUEST_MESSAGE), GET_SIZE(
      TCMessageType.GET_ALL_SIZE_SERVER_MAP_REQUEST_MESSAGE), GET_ALL_KEYS(
      TCMessageType.GET_ALL_KEYS_SERVER_MAP_REQUEST_MESSAGE);

  private final TCMessageType requestMessageType;

  ServerMapRequestType(TCMessageType requestMessageType) {
    this.requestMessageType = requestMessageType;
  }

  public static ServerMapRequestType fromOrdinal(final int ordinal) {
    ServerMapRequestType[] values = ServerMapRequestType.values();
    if (ordinal < 0 || ordinal >= values.length) { throw new AssertionError("Unknown ordinal : " + ordinal); }
    return values[ordinal];
  }

  public ServerMapRequestMessage createRequestMessage(final MessageChannel channel) {
    return (ServerMapRequestMessage) channel.createMessage(requestMessageType);
  }

}
