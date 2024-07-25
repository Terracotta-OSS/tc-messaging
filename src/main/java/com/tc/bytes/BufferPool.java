/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.bytes;

public interface BufferPool {

  void offer(TCByteBuffer buf) throws InterruptedException;

}
