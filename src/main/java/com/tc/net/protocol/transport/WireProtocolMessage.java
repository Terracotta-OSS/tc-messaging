/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.transport;

import com.tc.net.core.TCConnection;
import com.tc.net.protocol.TCNetworkMessage;

public interface WireProtocolMessage extends TCNetworkMessage {

  public short getMessageProtocol();

  public WireProtocolHeader getWireProtocolHeader();

  public TCConnection getSource();

}
