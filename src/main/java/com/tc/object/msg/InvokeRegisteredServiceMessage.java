/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.bytes.TCByteBuffer;
import com.tc.io.TCByteBufferOutputStream;
import com.tc.net.protocol.tcm.MessageChannel;
import com.tc.net.protocol.tcm.MessageMonitor;
import com.tc.net.protocol.tcm.TCMessageHeader;
import com.tc.net.protocol.tcm.TCMessageType;
import com.tc.object.management.RemoteCallHolder;
import com.tc.object.session.SessionID;

import java.io.IOException;

/**
 *
 */
public class InvokeRegisteredServiceMessage extends AbstractManagementMessage {

  private static final byte REMOTE_CALL_HOLDER = 1;

  private RemoteCallHolder remoteCallHolder;


  public InvokeRegisteredServiceMessage(SessionID sessionID, MessageMonitor monitor, TCByteBufferOutputStream out, MessageChannel channel, TCMessageType type) {
    super(sessionID, monitor, out, channel, type);
  }

  public InvokeRegisteredServiceMessage(SessionID sessionID, MessageMonitor monitor, MessageChannel channel, TCMessageHeader header, TCByteBuffer[] data) {
    super(sessionID, monitor, channel, header, data);
  }

  public RemoteCallHolder getRemoteCallHolder() {
    return remoteCallHolder;
  }

  public void setRemoteCallHolder(RemoteCallHolder remoteCallHolder) {
    this.remoteCallHolder = remoteCallHolder;
  }

  @Override
  protected void dehydrateValues() {
    super.dehydrateValues();
    putNVPair(REMOTE_CALL_HOLDER, remoteCallHolder);
  }

  @Override
  protected boolean hydrateValue(byte name) throws IOException {
    if (!super.hydrateValue(name)) {
      switch (name) {
        case REMOTE_CALL_HOLDER:
          remoteCallHolder = (RemoteCallHolder)getObject(new RemoteCallHolder());
          return true;

        default:
          return false;
      }
    } else {
      return true;
    }
  }

}
