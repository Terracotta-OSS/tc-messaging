/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.io;

import com.tc.bytes.TCByteBuffer;
import com.tc.lang.Recyclable;

public interface TCByteBufferOutput extends TCDataOutput, Recyclable {

  public TCByteBuffer[] toArray();

  public void write(TCByteBuffer[] data);

}
