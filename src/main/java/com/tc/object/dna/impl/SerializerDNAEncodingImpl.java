/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.dna.impl;

import com.tc.object.loaders.ClassProvider;
import com.tc.util.ClassUtils;

public class SerializerDNAEncodingImpl extends BaseDNAEncodingImpl {

  private static final ClassProvider LOCAL_PROVIDER = new LocalClassProvider();

  public SerializerDNAEncodingImpl() {
    super(LOCAL_PROVIDER);
  }

  @Override
  protected boolean useStringEnumRead(final byte type) {
    return (type == TYPE_ID_ENUM);
  }

  @Override
  protected boolean useClassProvider(final byte type, final byte typeToCheck) {
    return (type == typeToCheck);
  }

  @Override
  protected boolean useUTF8String(final byte type) {
    return (type == TYPE_ID_STRING);
  }

  private static class LocalClassProvider implements ClassProvider {

    // This method assumes the Class is visible in this VM and can be loaded by the same class loader as this
    // object.
    @Override
    public Class getClassFor(final String className) {
      try {
        ClassUtils.validatePackageOfInvokedClass(className);
        return Class.forName(className);
      } catch (final ClassNotFoundException e) {
        throw new AssertionError(e);
      }
    }

  }
}
