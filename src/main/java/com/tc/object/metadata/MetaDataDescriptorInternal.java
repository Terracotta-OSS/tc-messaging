/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.metadata;

import com.tc.io.TCByteBufferOutput;
import com.tc.object.ObjectID;
import com.tc.object.dna.impl.ObjectStringSerializer;

public interface MetaDataDescriptorInternal extends MetaDataDescriptor {

  int numberOfNvPairs();

  ObjectID getObjectId();

  void setObjectID(ObjectID id);

  void serializeTo(TCByteBufferOutput output, ObjectStringSerializer serializer);

}
