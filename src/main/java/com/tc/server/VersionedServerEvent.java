/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */

package com.tc.server;

/**
 * @author Eugene Shelestovich
 */
public interface VersionedServerEvent extends ServerEvent {

  long DEFAULT_VERSION = -1L;

  void setValue(byte[] value);

  long getVersion();
}
