/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net.groups;

import com.tc.io.TCSerializable;
import com.tc.net.NodeID;
import com.tc.net.protocol.tcm.TCMessageImpl;

public interface GroupMessage extends TCSerializable {

  public int getType();
    
  public abstract MessageID getMessageID();

  public abstract MessageID inResponseTo();

  public abstract void setMessageOrginator(NodeID n);

  public abstract NodeID messageFrom();
  
  public boolean isRecycleOnRead(TCMessageImpl message);

}
