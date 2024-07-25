/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.net.protocol.transport;


public interface HealthCheckerProbeMessage extends WireProtocolMessage {

  boolean isPing();

  boolean isPingReply();

  long getTime();

  boolean isTimeCheck();
}
