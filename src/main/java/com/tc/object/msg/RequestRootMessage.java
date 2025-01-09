/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.lang.Recyclable;
import com.tc.net.protocol.tcm.TCMessage;

public interface RequestRootMessage extends TCMessage, Recyclable {

  public String getRootName();

  public void initialize(String name);

}
