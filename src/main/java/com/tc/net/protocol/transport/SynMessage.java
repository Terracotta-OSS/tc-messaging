/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net.protocol.transport;

public interface SynMessage extends TransportHandshakeMessage {
  int getCallbackPort();
}
