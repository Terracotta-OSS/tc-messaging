/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.text;

public interface PrettyPrintable {

  public PrettyPrinter prettyPrint(PrettyPrinter out);
}
