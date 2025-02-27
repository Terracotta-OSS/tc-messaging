/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
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
