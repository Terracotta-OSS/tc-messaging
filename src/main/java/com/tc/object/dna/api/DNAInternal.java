/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.dna.api;

public interface DNAInternal extends DNA {

  MetaDataReader getMetaDataReader();

  boolean hasMetaData();

}
