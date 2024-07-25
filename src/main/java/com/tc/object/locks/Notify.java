/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.locks;

import com.tc.io.TCSerializable;

public interface Notify extends TCSerializable {
//
  public boolean isNull();
  
  public LockID getLockID();
  
  public ThreadID getThreadID();
  
  public boolean getIsAll();
}
