/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.tx;

import com.tc.util.AbstractIdentifier;

/**
 * @author steve
 */
public class TransactionID extends AbstractIdentifier {
  public final static TransactionID NULL_ID = new TransactionID();

  public TransactionID(long id) {
    super(id);
  }

  private TransactionID() {
    super();
  }

  @Override
  public String getIdentifierType() {
    return "TransactionID";
  }

  public TransactionID next() {
    return new TransactionID(toLong() + 1);
  }

}
