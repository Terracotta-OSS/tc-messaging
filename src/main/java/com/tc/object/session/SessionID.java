/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.session;

import com.tc.util.AbstractIdentifier;

/**
 * Session identifier
 */
public class SessionID extends AbstractIdentifier {

  /**
   * Represents no session (id=-1)
   */
  public static final SessionID NULL_ID = new SessionID(-1);
  
  /**
   * Create new session with specified identifier
   * @param id Id value
   */
  public SessionID(long id) {
    super(id);
  }

  @Override
  public String getIdentifierType() {
    return "SessionID";
  }

}
