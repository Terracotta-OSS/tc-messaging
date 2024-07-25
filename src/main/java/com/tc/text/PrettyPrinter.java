/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.text;

public interface PrettyPrinter {

  public void autoflush(boolean b);

  public boolean autoflush();
  
  public PrettyPrinter print(Object o);

  public PrettyPrinter println(Object o);

  public PrettyPrinter println();

  public PrettyPrinter indent();

  public PrettyPrinter duplicateAndIndent();
  
  public PrettyPrinter visit(Object o);
  
  public void flush();
}
