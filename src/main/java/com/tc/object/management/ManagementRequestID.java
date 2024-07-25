/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.management;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 */
public final class ManagementRequestID {

  private static final AtomicLong ID_GENERATOR = new AtomicLong();

  private final long id;

  public ManagementRequestID() {
    this.id = ID_GENERATOR.incrementAndGet();
  }

  public ManagementRequestID(long longValue) {
    this.id = longValue;
  }

  public long getId() {
    return id;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ManagementRequestID) {
      ManagementRequestID other = (ManagementRequestID)obj;
      return other.id == id;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return new Long(id).hashCode();
  }

  @Override
  public String toString() {
    return "ManagementRequestID[" + id + "]";
  }
}
