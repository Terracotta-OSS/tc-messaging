/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol;

import com.tc.bytes.TCByteBuffer;
import com.tc.net.core.TCConnection;

/**
 * Message adaptor/parser for incoming data from TCConnection
 * 
 * @author teck
 */
public interface TCProtocolAdaptor {
  public void addReadData(TCConnection source, TCByteBuffer data[], int length) throws TCProtocolException;

  public TCByteBuffer[] getReadBuffers();  
}

