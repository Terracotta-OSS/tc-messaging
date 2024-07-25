/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net.groups;

import com.tc.util.AbstractIdentifier;

public class MessageID extends AbstractIdentifier {

  public static final MessageID NULL_ID = new MessageID();

  public MessageID(long id) {
    super(id);
  }

  private MessageID() {
    super();
  }

  @Override
  public String getIdentifierType() {
    return "MessageID";
  }

}
