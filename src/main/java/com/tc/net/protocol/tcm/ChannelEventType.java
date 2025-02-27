/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.tcm;

public enum ChannelEventType {
  TRANSPORT_DISCONNECTED_EVENT, TRANSPORT_CONNECTED_EVENT, CHANNEL_CLOSED_EVENT, CHANNEL_OPENED_EVENT, TRANSPORT_RECONNECTION_REJECTED_EVENT;

  public boolean matches(ChannelEvent event) {
    return event == null ? false : event.getType() == this;
  }

  @Override
  public String toString() {
    return name();
  }
}
