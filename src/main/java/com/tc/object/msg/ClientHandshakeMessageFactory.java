/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.NodeID;

public interface ClientHandshakeMessageFactory {

  public ClientHandshakeMessage newClientHandshakeMessage(NodeID remoteNode, String clientVersion,
                                                          boolean isEnterpriseClient);

}
