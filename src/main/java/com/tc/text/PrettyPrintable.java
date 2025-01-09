/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.text;

public interface PrettyPrintable {

  public PrettyPrinter prettyPrint(PrettyPrinter out);
}
