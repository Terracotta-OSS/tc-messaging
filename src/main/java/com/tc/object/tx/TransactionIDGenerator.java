/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.tx;

import java.util.concurrent.atomic.AtomicLong;

public class TransactionIDGenerator {

  private final AtomicLong id = new AtomicLong(0);

  public TransactionID nextTransactionID() {
    return new TransactionID(id.incrementAndGet());
  }

}
