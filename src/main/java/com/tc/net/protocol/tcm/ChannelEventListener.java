/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net.protocol.tcm;


public interface ChannelEventListener {
  public void notifyChannelEvent(ChannelEvent event);
}
