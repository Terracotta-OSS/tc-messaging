/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.groups;

import com.tc.bytes.TCByteBuffer;
import com.tc.io.TCByteBufferInputStream;
import com.tc.io.TCByteBufferOutputStream;
import com.tc.net.protocol.tcm.MessageChannel;
import com.tc.net.protocol.tcm.MessageMonitor;
import com.tc.net.protocol.tcm.TCMessageHeader;
import com.tc.net.protocol.tcm.TCMessageType;
import com.tc.object.msg.DSOMessageBase;
import com.tc.object.session.SessionID;
import com.tc.util.ClassUtils;

import java.io.IOException;

/**
 * @author EY
 */
public class TCGroupMessageWrapper extends DSOMessageBase {
  private final static byte GROUP_MESSAGE_ID = 1;
  private GroupMessage      message;

  public TCGroupMessageWrapper(SessionID sessionID, MessageMonitor monitor, TCByteBufferOutputStream out,
                               MessageChannel channel, TCMessageType type) {
    super(sessionID, monitor, out, channel, type);
  }

  public TCGroupMessageWrapper(SessionID sessionID, MessageMonitor monitor, MessageChannel channel,
                               TCMessageHeader header, TCByteBuffer[] data) {
    super(sessionID, monitor, channel, header, data);
  }

  public void setGroupMessage(GroupMessage message) {
    this.message = message;
  }

  public GroupMessage getGroupMessage() {
    return this.message;
  }

  @Override
  protected void dehydrateValues() {
    putNVPair(GROUP_MESSAGE_ID, this.message.getClass().getName());
    this.message.serializeTo(getOutputStream());
  }

  @Override
  protected boolean hydrateValue(byte name) throws IOException {
    switch (name) {
      case GROUP_MESSAGE_ID:
        TCByteBufferInputStream in = getInputStream();
        try {
          String className = in.readString();
          ClassUtils.validatePackageOfInvokedClass(className);
          Class clazz = Class.forName(className, false, getClass().getClassLoader());
          if(!GroupMessage.class.isAssignableFrom(clazz)) {
            throw new RuntimeException("Invalid class invocation : " + className);
          }
          this.message = (GroupMessage) clazz.newInstance();
        } catch (InstantiationException e) {
          throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
          throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
        }
        this.message.deserializeFrom(in);
        return true;
      default:
        return false;
    }
  }

  @Override
  public void doRecycleOnRead() {
    if (message.isRecycleOnRead(this)) {
      super.doRecycleOnRead();
    }
  }
}
