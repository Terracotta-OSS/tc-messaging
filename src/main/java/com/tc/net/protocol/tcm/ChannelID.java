/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net.protocol.tcm;

import com.tc.util.AbstractIdentifier;

/**
 * Identifier for a client session
 * 
 * @author steve
 */
public class ChannelID extends AbstractIdentifier {
  /**
   * Indicates no ID
   */
  public static final ChannelID NULL_ID      = new ChannelID();
  
  /**
   * Construct with specific id value
   * @param id ID value
   */
  public ChannelID(long id) {
    super(id);
  }

  private ChannelID() {
    super();
  }

  @Override
  public String getIdentifierType() {
    return "ChannelID";
  }
}
