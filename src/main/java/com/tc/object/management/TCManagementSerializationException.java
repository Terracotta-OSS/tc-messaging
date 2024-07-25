/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
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
