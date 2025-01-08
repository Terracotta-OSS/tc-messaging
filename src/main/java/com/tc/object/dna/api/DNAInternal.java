/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.dna.api;

public interface DNAInternal extends DNA {

  MetaDataReader getMetaDataReader();

  boolean hasMetaData();

}
