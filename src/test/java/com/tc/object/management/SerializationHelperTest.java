/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */

package com.tc.object.management;

import com.tc.util.Assert;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
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

   @Test
   public void testDeserializationUsesStreamSpecificFilter() throws Exception {
      byte[] raw;
      try (ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(out)) {
        oo.writeObject(new FilterTestPayload());
        oo.flush();
        raw = out.toByteArray();
      }

      AtomicBoolean filterInvoked = new AtomicBoolean(false);
      ObjectInputFilter filter = filterInfo -> {
        if (filterInfo.serialClass() == FilterTestPayload.class) {
          filterInvoked.set(true);
          return ObjectInputFilter.Status.REJECTED;
        }
        return ObjectInputFilter.Status.UNDECIDED;
      };

      try {
        SerializationHelper.deserialize(raw, getClass().getClassLoader(), filter);
        Assert.fail("Expected filter to reject payload");
      } catch (TCManagementSerializationException expected) {
        Assert.assertTrue(filterInvoked.get());
      }
   }

   private static class FilterTestPayload implements Serializable {
     private static final long serialVersionUID = 1L;
   }
}
