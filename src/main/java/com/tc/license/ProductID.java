/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.license;

/**
 * @author tim
 */
public enum ProductID {
  TMS(true), WAN(true), USER(false);

  private final boolean internal;

  ProductID(boolean internal) {
    this.internal = internal;
  }

  public boolean isInternal() {
    return internal;
  }
}
