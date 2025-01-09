/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
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
