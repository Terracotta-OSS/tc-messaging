/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
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
