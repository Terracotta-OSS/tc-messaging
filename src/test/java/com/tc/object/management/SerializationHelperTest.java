/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */

package com.tc.object.management;

import com.tc.util.Assert;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 */
public class SerializationHelperTest {
  
  public SerializationHelperTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

   @Test
   public void testArrayClassResolve() throws Exception {
      byte[] raw;
      String[] sa = new String[] {"foo", "bar", "baz"};
     
      try (ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(out)) {
        oo.writeObject(sa);
        oo.flush();
        raw = out.toByteArray();
      }
     
      Object check = SerializationHelper.deserialize(raw, getClass().getClassLoader());
      Assert.assertTrue(check, check.getClass().isArray());
      Assert.assertTrue(check, check.getClass().getComponentType().isAssignableFrom(String.class));
      String[] look = (String[])check;
      Assert.assertEquals(sa.length, look.length);
      for (int x=0;x<sa.length;x++) {
        Assert.assertEquals(sa[x], look[x]);
      }
   }
   

   @Test
   public void testMultiArrayResolve() throws Exception {
      byte[] raw;
      String[][] sa = new String[][] {{"foo"}, {"bar"}, {"baz"}};
     
      try (ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(out)) {
        oo.writeObject(sa);
        oo.flush();
        raw = out.toByteArray();
      }
     
      Object check = SerializationHelper.deserialize(raw, getClass().getClassLoader());
      Assert.assertTrue(check, check.getClass().isArray());
      Assert.assertTrue(check, check.getClass().getComponentType().isArray());
   }
}
