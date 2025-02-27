/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.dna.api;

import com.tc.exception.TCRuntimeException;

/**
 * Generic exception thrown when working with DNA.  Typically used a replacement for something 
 * like IOException or other non-Terracotta exception
 */
public class DNAException extends TCRuntimeException {
  public DNAException() {
    super();
  }

  public DNAException(String msg) {
    super(msg);
  }

  public DNAException(Exception e) {
    super(e);
  }
}