/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net.protocol.transport;

import com.tc.net.protocol.TCNetworkMessage;

import java.util.Iterator;

public interface WireProtocolGroupMessage extends WireProtocolMessage {

  public Iterator<TCNetworkMessage> getMessageIterator();

  public int getTotalMessageCount();

}
