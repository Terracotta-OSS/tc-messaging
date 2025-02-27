/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.bytes.TCByteBuffer;
import com.tc.io.TCByteBufferOutputStream;
import com.tc.net.protocol.tcm.MessageChannel;
import com.tc.net.protocol.tcm.MessageMonitor;
import com.tc.net.protocol.tcm.TCMessageHeader;
import com.tc.net.protocol.tcm.TCMessageType;
import com.tc.object.session.SessionID;
import com.tc.object.tx.TxnBatchID;

import java.io.IOException;

/**
 * This message sent from server to client when a batch of transactions has completely been apply()'d. This does NOT
 * mean that the transactions are complete (i.e. this ACK should NOT be used to allow a client side commit to complete).
 */
public class BatchTransactionAcknowledgeMessageImpl extends DSOMessageBase implements
    BatchTransactionAcknowledgeMessage {
  private static final byte BATCH_ID = 1;

  private TxnBatchID        batchID;

  public BatchTransactionAcknowledgeMessageImpl(SessionID sessionID, MessageMonitor monitor, TCByteBufferOutputStream out, MessageChannel channel,
                                                TCMessageType type) {
    super(sessionID, monitor, out, channel, type);
  }

  public BatchTransactionAcknowledgeMessageImpl(SessionID sessionID, MessageMonitor monitor, MessageChannel channel,
                                                TCMessageHeader header, TCByteBuffer[] data) {
    super(sessionID, monitor, channel, header, data);
  }

  @Override
  protected void dehydrateValues() {
    putNVPair(BATCH_ID, batchID.toLong());
  }

  @Override
  protected boolean hydrateValue(byte name) throws IOException {
    switch (name) {
      case BATCH_ID: {
        this.batchID = new TxnBatchID(getLongValue());
        return true;
      }
      default: {
        return false;
      }
    }
  }

  @Override
  public void initialize(TxnBatchID id) {
    this.batchID = id;
  }

  @Override
  public TxnBatchID getBatchID() {
    return batchID;
  }
}
