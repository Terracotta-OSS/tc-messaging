/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.dna.impl;

public interface StringCompressionConfig {

  boolean enabled();

  boolean loggingEnabled();

  int minSize();
}
