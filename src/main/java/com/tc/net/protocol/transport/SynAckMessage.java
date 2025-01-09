/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.transport;

public interface SynAckMessage extends TransportHandshakeMessage {

  public String getErrorContext();

  public short getErrorType();

  public boolean hasErrorContext();

  @Override
  public boolean isMaxConnectionsExceeded();

  int getCallbackPort();

  @Override
  public int getMaxConnections();

}
