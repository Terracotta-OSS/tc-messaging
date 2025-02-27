/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.bytes.TCByteBuffer;
import com.tc.lang.Recyclable;
import com.tc.net.protocol.tcm.TCMessage;
import com.tc.object.dna.impl.ObjectStringSerializer;
import com.tc.object.tx.TransactionBatch;

public interface CommitTransactionMessage extends TCMessage, Recyclable {

  public ObjectStringSerializer getSerializer();

  public void setBatch(TransactionBatch batch, ObjectStringSerializer serializer);

  public TCByteBuffer[] getBatchData();

}
