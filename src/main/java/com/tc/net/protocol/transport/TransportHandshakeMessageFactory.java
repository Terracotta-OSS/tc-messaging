/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.transport;

import com.tc.net.core.TCConnection;

public interface TransportHandshakeMessageFactory {

  public TransportHandshakeMessage createSyn(ConnectionID connectionId, TCConnection source, short stackLayerFlags,
                                             int callbackPort);

  public TransportHandshakeMessage createAck(ConnectionID connectionId, TCConnection source);

  public TransportHandshakeMessage createSynAck(ConnectionID connectionId, TCConnection source,
                                                boolean isMaxConnectionsExceeded, int maxConnections, int callbackPort);

  public TransportHandshakeMessage createSynAck(ConnectionID connectionId, TransportHandshakeError error,
                                                TCConnection source, boolean isMaxConnectionsExceeded,
                                                int maxConnections);
}
