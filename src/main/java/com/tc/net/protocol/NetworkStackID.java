/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net.protocol;

import com.tc.util.AbstractIdentifier;

public class NetworkStackID extends AbstractIdentifier {

  public NetworkStackID(long id) {
    super(id);
  }
  
  @Override
  public String getIdentifierType() {
    return "NetworkStackID";
  }

}
