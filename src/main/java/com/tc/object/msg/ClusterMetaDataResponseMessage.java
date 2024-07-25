/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.net.protocol.tcm.TCMessage;
import com.tc.object.locks.ThreadID;

public interface ClusterMetaDataResponseMessage extends TCMessage {

  public abstract ThreadID getThreadID();

}
