/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.security.SecureRandom;
import java.util.Random;

import org.junit.Test;

public class StackTest {

  @Test
  public void test() throws Exception {
    Stack tcStack = new Stack();
    java.util.Stack javaStack = new java.util.Stack();

    doRandomTests(tcStack, javaStack);
  }

  private void doRandomTests(Stack tcStack, java.util.Stack javaStack) {
    SecureRandom sr = new SecureRandom();
    long seed = sr.nextLong();
    Random r = new Random(seed);
    try {
      int count = 10000;
      while (count-- > 0) {
        switch (r.nextInt(6)) {
          case 0:
            callPop(tcStack, javaStack);
            break;
          case 1:
            callPush(tcStack, javaStack, r);
            break;
          case 2:
            callPeek(tcStack, javaStack);
            break;
          case 3:
            callEmpty(tcStack, javaStack);
            break;
          case 4:
            callSize(tcStack, javaStack);
            break;
          case 5:
            callSearch(tcStack, javaStack, r);
            break;
          default:
            throw new AssertionError("Should never get here.");
        }
      }
    } catch (AssertionError e) {
      throw new AssertionError("Failure with seed " + seed + " " + e);
    }
  }

  private void callSearch(Stack tcStack, java.util.Stack javaStack, Random r) {
    Integer subject = Integer.valueOf(r.nextInt(10000));
    assertEquals(javaStack.search(subject), tcStack.search(subject));
  }

  private void callSize(Stack tcStack, java.util.Stack javaStack) {
    assertEquals(javaStack.size(), tcStack.size());
  }

  private void callEmpty(Stack tcStack, java.util.Stack javaStack) {
    assertEquals(javaStack.empty(), tcStack.empty());
  }

  private void callPush(Stack tcStack, java.util.Stack javaStack, Random r) {
    Integer subject = Integer.valueOf(r.nextInt(10000));
    assertEquals(javaStack.push(subject), tcStack.push(subject));
    assertEquals(javaStack.size(), tcStack.size());
  }

  private void callPeek(Stack tcStack, java.util.Stack javaStack) {
    boolean thrownException = false;
    Object jo = null, to = null;
    Exception je = null, te = null;
    try {
      jo = javaStack.peek();
    } catch (Exception ex) {
      je = ex;
      thrownException = true;
    }
    try {
      to = tcStack.peek();
      assertFalse(thrownException);
    } catch (Exception ex) {
      assertTrue(thrownException);
      te = ex;
    }
    assertEquals(jo, to);
    if (je != null) {
      assertEquals(je.toString(), te.toString());
    }
  }

  private void callPop(Stack tcStack, java.util.Stack javaStack) {
    boolean thrownException = false;
    Object jo = null, to = null;
    Exception je = null, te = null;
    try {
      jo = javaStack.pop();
    } catch (Exception ex) {
      je = ex;
      thrownException = true;
    }
    try {
      to = tcStack.pop();
      assertFalse(thrownException);
    } catch (Exception ex) {
      assertTrue(thrownException);
      te = ex;
    }
    assertEquals(jo, to);
    if (je != null) {
      assertEquals(je.toString(), te.toString());
    }
  }

}
