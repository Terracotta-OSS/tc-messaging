/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.transport;

public interface SynMessage extends TransportHandshakeMessage {
  int getCallbackPort();
}
