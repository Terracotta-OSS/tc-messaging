/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.tx;

import com.tc.bytes.TCByteBuffer;
import com.tc.lang.Recyclable;

public interface TransactionBatch extends Recyclable {

  public boolean isEmpty();

  public TCByteBuffer[] getData();
  
}
