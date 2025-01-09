/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.tcm;


public interface ChannelEventListener {
  public void notifyChannelEvent(ChannelEvent event);
}
