/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.change;

import com.tc.object.LogicalOperation;
import com.tc.object.TCObject;
import com.tc.object.dna.api.DNAWriter;
import com.tc.object.dna.api.LogicalChangeID;
import com.tc.object.metadata.MetaDataDescriptorInternal;

/**
 * @author orion
 */
public interface TCChangeBuffer {

  public boolean isEmpty();

  public void literalValueChanged(Object newValue);

  public void fieldChanged(String classname, String fieldname, Object newValue, int index);

  public void arrayChanged(int startPos, Object array, int length);

  public void logicalInvoke(LogicalOperation method, Object[] parameters, LogicalChangeID id);

  public void writeTo(DNAWriter writer);

  public TCObject getTCObject();

  public void addMetaDataDescriptor(MetaDataDescriptorInternal md);

  public boolean hasMetaData();

}
