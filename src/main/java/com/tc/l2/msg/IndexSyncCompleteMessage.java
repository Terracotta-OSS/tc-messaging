/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.l2.msg;

import com.tc.async.api.OrderedEventContext;
import com.tc.io.TCByteBufferInput;
import com.tc.io.TCByteBufferOutput;
import com.tc.net.groups.AbstractGroupMessage;
import com.tc.util.Assert;

import java.io.IOException;

public class IndexSyncCompleteMessage extends AbstractGroupMessage implements OrderedEventContext {
  public static final int INDEX_SYNC_COMPLETE_TYPE = 0;

  private long            sequenceID;

  public IndexSyncCompleteMessage() {
    // Make serialization happy
    super(-1);
  }

  public IndexSyncCompleteMessage(long sID) {
    super(INDEX_SYNC_COMPLETE_TYPE);
    this.sequenceID = sID;
  }

  @Override
  protected void basicDeserializeFrom(TCByteBufferInput in) throws IOException {
    Assert.assertEquals(INDEX_SYNC_COMPLETE_TYPE, getType());
    this.sequenceID = in.readLong();
  }

  @Override
  protected void basicSerializeTo(TCByteBufferOutput out) {
    Assert.assertEquals(INDEX_SYNC_COMPLETE_TYPE, getType());
    out.writeLong(this.sequenceID);
  }

  @Override
  public long getSequenceID() {
    return this.sequenceID;
  }

}
