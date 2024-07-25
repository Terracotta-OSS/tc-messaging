/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net.protocol;

/**
 * A generic network message sink
 * 
 * @author teck
 */
public interface NetworkMessageSink {
  public void putMessage(TCNetworkMessage message);
}
