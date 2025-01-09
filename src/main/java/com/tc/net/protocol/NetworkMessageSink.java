/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
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
