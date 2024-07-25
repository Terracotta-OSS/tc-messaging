/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.bytes.TCByteBuffer;
import com.tc.net.protocol.tcm.TCMessage;
import com.tc.object.dna.impl.ObjectStringSerializer;

import java.util.Collection;

/**
 * @author steve
 */
public interface RequestManagedObjectResponseMessage extends TCMessage {

  public Collection getObjects();
  
  public void initialize(TCByteBuffer[] dnas, int count, ObjectStringSerializer aSerializer, long bid, int tot);

  public ObjectStringSerializer getSerializer();

  public long getBatchID();

  public int getTotal();

  public void doRecycleOnRead();
}
