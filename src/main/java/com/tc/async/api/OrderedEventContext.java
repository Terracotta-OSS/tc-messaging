/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.async.api;

public interface OrderedEventContext extends EventContext {

  public long getSequenceID();
  
}
