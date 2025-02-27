/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.l2.msg;

import com.tc.async.api.OrderedEventContext;
import com.tc.io.TCByteBufferInput;
import com.tc.io.TCByteBufferOutput;
import com.tc.net.groups.AbstractGroupMessage;
import com.tc.util.Assert;

import java.io.IOException;

public class ObjectSyncCompleteMessage extends AbstractGroupMessage implements OrderedEventContext {

  public static final int OBJECT_SYNC_COMPLETE = 0x00;
  private long            sequence;

  // To make serialization happy
  public ObjectSyncCompleteMessage() {
    super(-1);
  }

  public ObjectSyncCompleteMessage(long sequence) {
    super(OBJECT_SYNC_COMPLETE);
    this.sequence = sequence;
  }

  @Override
  protected void basicDeserializeFrom(TCByteBufferInput in) throws IOException {
    Assert.assertEquals(OBJECT_SYNC_COMPLETE, getType());
    this.sequence = in.readLong();
  }

  @Override
  protected void basicSerializeTo(TCByteBufferOutput out) {
    Assert.assertEquals(OBJECT_SYNC_COMPLETE, getType());
    out.writeLong(this.sequence);
  }

  @Override
  public long getSequenceID() {
    return this.sequence;
  }

}
