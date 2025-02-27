/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.l2.msg;

import com.tc.async.api.EventContext;
import com.tc.io.TCByteBufferInput;
import com.tc.io.TCByteBufferOutput;
import com.tc.net.groups.AbstractGroupMessage;
import com.tc.net.groups.MessageID;
import com.tc.util.Assert;

import java.io.IOException;

public class IndexSyncAckMessage extends AbstractGroupMessage implements EventContext {

  public static final int INDEX_SYNC_ACK_TYPE = 0;
  private int             amount;

  public IndexSyncAckMessage() {
    // Make serialization happy
    super(-1);
  }

  public IndexSyncAckMessage(MessageID requestID, int amountToAck) {
    super(INDEX_SYNC_ACK_TYPE, requestID);
    this.amount = amountToAck;
  }

  @Override
  protected void basicDeserializeFrom(TCByteBufferInput in) throws IOException {
    Assert.assertEquals(INDEX_SYNC_ACK_TYPE, getType());
    amount = in.readInt();
  }

  @Override
  protected void basicSerializeTo(TCByteBufferOutput out) {
    Assert.assertEquals(INDEX_SYNC_ACK_TYPE, getType());
    out.writeInt(amount);
  }

  public int getAmount() {
    return amount;
  }

}
