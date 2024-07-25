/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
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
