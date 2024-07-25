/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UUIDTest {

  @Test
  public void testUUID() {
    // This test is located in one of the JDK1.5 specific source trees on purpose. If it is moved someplace where a 1.4
    // runtime will execute it, it will fail.

    String s = UUID.getUUID().toString();
    assertEquals(32, s.length());
  }

}
