/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object;

import com.tc.util.AbstractIdentifier;

public class ObjectRequestID extends AbstractIdentifier {
  
  public static final ObjectRequestID NULL_ID = new ObjectRequestID();

  private static final String ID_TYPE = "ObjectRequestID";

  public ObjectRequestID(long id) {
    super(id);
  }

  private ObjectRequestID() {
    super();
  }

  @Override
  public String getIdentifierType() {
    return ID_TYPE;
  }

}
