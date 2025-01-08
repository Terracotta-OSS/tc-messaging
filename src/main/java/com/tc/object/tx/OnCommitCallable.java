/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.tx;

import com.tc.abortable.AbortedOperationException;

public interface OnCommitCallable {
  public void call() throws AbortedOperationException;
}
