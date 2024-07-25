/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.util;

public class SequenceGenerator {

  private long seq;

  public SequenceGenerator() {
    this(0);
  }

  public SequenceGenerator(long start) {
    this.seq = start - 1;
  }
  
  public synchronized long getNextSequence() {
    return ++seq;
  }

  public synchronized long getCurrentSequence() {
    return seq;
  }
}
