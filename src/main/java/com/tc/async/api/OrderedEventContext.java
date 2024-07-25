/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.async.api;

public interface OrderedEventContext extends EventContext {

  public long getSequenceID();
  
}
