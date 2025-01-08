/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.transport;


public interface HealthCheckerProbeMessage extends WireProtocolMessage {

  boolean isPing();

  boolean isPingReply();

  long getTime();

  boolean isTimeCheck();
}
