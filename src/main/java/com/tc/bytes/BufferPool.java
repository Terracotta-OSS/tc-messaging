/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.bytes;

public interface BufferPool {

  void offer(TCByteBuffer buf) throws InterruptedException;

}
