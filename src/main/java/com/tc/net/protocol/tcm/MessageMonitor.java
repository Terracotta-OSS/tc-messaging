/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.tcm;

public interface MessageMonitor {

  public void newIncomingMessage(TCMessage message);

  public void newOutgoingMessage(TCMessage message);

}
