/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.dna.impl;

public interface StringCompressionConfig {

  boolean enabled();

  boolean loggingEnabled();

  int minSize();
}
