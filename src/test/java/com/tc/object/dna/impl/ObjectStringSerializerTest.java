/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.dna.impl;

import java.io.IOException;
import java.util.Arrays;

import com.tc.io.TCByteBufferInputStream;
import com.tc.io.TCByteBufferOutputStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ObjectStringSerializerTest {

  @Test
  public void test() throws IOException {
    // write it
    TCByteBufferOutputStream out = new TCByteBufferOutputStream();
    ObjectStringSerializer ser = new ObjectStringSerializerImpl();

    ser.writeFieldName(out, "className.fieldName");
    ser.writeString(out, "timmy teck");
    ser.writeFieldName(out, "className.fieldName");
    ser.writeString(out, "timmy teck");

    assertEquals(16, out.getBytesWritten());
    assertEquals(51, ser.getApproximateBytesWritten());

    // cook it
    TCByteBufferOutputStream data = new TCByteBufferOutputStream();
    ser.serializeTo(data);
    data.write(out.toArray());
    assertEquals(69, data.getBytesWritten());

    // read it
    TCByteBufferInputStream in = new TCByteBufferInputStream(data.toArray());
    ObjectStringSerializer ser2 = new ObjectStringSerializerImpl();
    ser2.deserializeFrom(in);

    String fn1 = ser2.readFieldName(in);
    String s1 = ser2.readString(in);
    String fn2 = ser2.readFieldName(in);
    String s2 = ser2.readString(in);

    assertEquals("className.fieldName", fn1);
    assertEquals("timmy teck", s1);
    assertEquals("className.fieldName", fn2);
    assertEquals("timmy teck", s2);
  }

  @Test
  public void testBytes() throws IOException {
    // write it
    TCByteBufferOutputStream out = new TCByteBufferOutputStream();
    ObjectStringSerializer ser = new ObjectStringSerializerImpl();

    byte[] bytes = new byte[] { 1, 2, 3, 4 };
    ser.writeStringBytes(out, bytes);

    assertEquals(12, ser.getApproximateBytesWritten());
    assertEquals(4, out.getBytesWritten());

    // cook it
    TCByteBufferOutputStream data = new TCByteBufferOutputStream();
    ser.serializeTo(data);
    data.write(out.toArray());

    assertEquals(24, data.getBytesWritten());

    // read it
    TCByteBufferInputStream in = new TCByteBufferInputStream(data.toArray());
    ObjectStringSerializer ser2 = new ObjectStringSerializerImpl();
    ser2.deserializeFrom(in);

    byte[] read = ser2.readStringBytes(in);

    assertTrue(Arrays.equals(bytes, read));
  }
}
