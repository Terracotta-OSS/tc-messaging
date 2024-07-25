/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.dna.api;

import com.tc.object.metadata.MetaDataDescriptorInternal;

public interface DNAWriterInternal extends DNAWriter {

  void addMetaData(MetaDataDescriptorInternal md);

}
