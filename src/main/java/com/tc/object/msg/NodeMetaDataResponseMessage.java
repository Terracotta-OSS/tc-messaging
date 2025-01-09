/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.object.locks.ThreadID;

public interface NodeMetaDataResponseMessage extends ClusterMetaDataResponseMessage {

  public void initialize(ThreadID threadID, String ip, String hostname);

  public String getIp();

  public String getHostname();

}
