/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.bytes;

public interface TCByteBufferFactoryConfig {
  boolean isDisabled();

  int getPoolMaxBufCount();

  int getCommonPoolMaxBufCount();
}
