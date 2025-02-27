/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.dna.api;

import com.tc.io.TCDataInput;
import com.tc.io.TCDataOutput;
import com.tc.object.dna.impl.ObjectStringSerializer;

import java.io.IOException;

public interface DNAEncodingInternal extends DNAEncoding {

  void encode(Object parameter, TCDataOutput output, ObjectStringSerializer serializer);

  Object decode(TCDataInput input, ObjectStringSerializer serializer) throws IOException, ClassNotFoundException;
}
