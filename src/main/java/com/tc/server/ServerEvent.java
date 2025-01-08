/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */

package com.tc.server;

/**
 * Server event.
 *
 * @author Eugene Shelestovich
 */
public interface ServerEvent {

  String getCacheName();

  ServerEventType getType();

  void setType(ServerEventType type);

  Object getKey();

  byte[] getValue();

}
