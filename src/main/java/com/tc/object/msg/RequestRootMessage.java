/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.lang.Recyclable;
import com.tc.net.protocol.tcm.TCMessage;

public interface RequestRootMessage extends TCMessage, Recyclable {

  public String getRootName();

  public void initialize(String name);

}
