/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.protocol.tcm.TCMessage;
import com.tc.object.locks.ThreadID;

public interface ClusterMetaDataMessage extends TCMessage {

  public ThreadID getThreadID();

  public void setThreadID(ThreadID threadID);

}
