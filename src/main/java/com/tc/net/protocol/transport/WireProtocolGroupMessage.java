/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.transport;

import com.tc.net.protocol.TCNetworkMessage;

import java.util.Iterator;

public interface WireProtocolGroupMessage extends WireProtocolMessage {

  public Iterator<TCNetworkMessage> getMessageIterator();

  public int getTotalMessageCount();

}
