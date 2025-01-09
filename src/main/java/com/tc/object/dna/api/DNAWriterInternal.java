/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.dna.api;

import com.tc.object.metadata.MetaDataDescriptorInternal;

public interface DNAWriterInternal extends DNAWriter {

  void addMetaData(MetaDataDescriptorInternal md);

}
