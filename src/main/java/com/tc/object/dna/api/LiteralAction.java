/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.dna.api;


/**
 * A Literal Value Action.
 */
public class LiteralAction {
  private final Object     value;

  public LiteralAction(Object value) {
    this.value = value;
  }
  
  public Object getObject() {
    return this.value;
  }
}
