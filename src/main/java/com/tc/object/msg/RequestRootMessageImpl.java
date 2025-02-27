/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.async.api.EventContext;
import com.tc.bytes.TCByteBuffer;
import com.tc.io.TCByteBufferOutputStream;
import com.tc.net.protocol.tcm.MessageChannel;
import com.tc.net.protocol.tcm.MessageMonitor;
import com.tc.net.protocol.tcm.TCMessageHeader;
import com.tc.net.protocol.tcm.TCMessageType;
import com.tc.object.session.SessionID;

import java.io.IOException;

/**
 * Message used for DistributedObjectProtocol
 * 
 * @author steve
 */
public class RequestRootMessageImpl extends DSOMessageBase implements EventContext, RequestRootMessage {
  private final static byte ROOT_NAME = 1;

  private String            rootName;

  public RequestRootMessageImpl(SessionID sessionID, MessageMonitor monitor, TCByteBufferOutputStream out, MessageChannel channel, TCMessageType type) {
    super(sessionID, monitor, out, channel, type);
  }

  public RequestRootMessageImpl(SessionID sessionID, MessageMonitor monitor, MessageChannel channel, TCMessageHeader header, TCByteBuffer[] data) {
    super(sessionID, monitor, channel, header, data);
  }

  @Override
  protected void dehydrateValues() {
    putNVPair(ROOT_NAME, rootName);
  }

  @Override
  protected boolean hydrateValue(byte name) throws IOException {
    switch (name) {
      case ROOT_NAME:
        this.rootName = getStringValue();
        return true;
      default:
        return false;
    }
  }
  
  @Override
  public String getRootName() {
    return rootName;
  }

  @Override
  public void initialize(String name) {
    this.rootName = name;
  }
}
