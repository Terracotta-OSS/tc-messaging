/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.tx;

import com.tc.bytes.TCByteBuffer;
import com.tc.lang.Recyclable;

public interface TransactionBatch extends Recyclable {

  public boolean isEmpty();

  public TCByteBuffer[] getData();
  
}
