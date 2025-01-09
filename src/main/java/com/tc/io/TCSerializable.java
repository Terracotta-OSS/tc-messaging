/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.io;


import java.io.IOException;

/**
 * @author teck
 */
public interface TCSerializable {
  public void serializeTo(TCByteBufferOutput serialOutput);

  public Object deserializeFrom(TCByteBufferInput serialInput) throws IOException;
}