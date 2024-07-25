/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
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
