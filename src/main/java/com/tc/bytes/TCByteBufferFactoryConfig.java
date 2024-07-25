/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.bytes;

public interface TCByteBufferFactoryConfig {
  boolean isDisabled();

  int getPoolMaxBufCount();

  int getCommonPoolMaxBufCount();
}
