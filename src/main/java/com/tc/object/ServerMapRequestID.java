/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object;

import com.tc.util.AbstractIdentifier;

public class ServerMapRequestID extends AbstractIdentifier {

  public static final ServerMapRequestID NULL_ID = new ServerMapRequestID();

  private static final String            ID_TYPE = "ServerMapRequestID";

  public ServerMapRequestID(final long id) {
    super(id);
  }

  private ServerMapRequestID() {
    super();
  }

  @Override
  public String getIdentifierType() {
    return ID_TYPE;
  }

}
