/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.tx;

import com.tc.abortable.AbortedOperationException;

public interface OnCommitCallable {
  public void call() throws AbortedOperationException;
}
