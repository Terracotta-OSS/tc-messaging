/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.management;

import com.tc.exception.TCRuntimeException;

/**
 *
 */
public class TCManagementSerializationException extends TCRuntimeException {
  public TCManagementSerializationException(String msg, Throwable t) {
    super(msg, t);
  }
}
