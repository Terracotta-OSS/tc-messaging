/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.net.NodeID;

public interface ClientHandshakeMessageFactory {

  public ClientHandshakeMessage newClientHandshakeMessage(NodeID remoteNode, String clientVersion,
                                                          boolean isEnterpriseClient);

}
