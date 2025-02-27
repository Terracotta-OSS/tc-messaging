/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.objectserver.core.impl;

import com.tc.util.AbstractIdentifier;

/*
 * All content copyright (c) 2003-2008 Terracotta, Inc., except as may otherwise be noted in a separate copyright
 * notice. All rights reserved.
 */

public class GarbageCollectionID extends AbstractIdentifier {

  public static final String NULL_UUID       = "NULL-UUID";

  private final String                          uuid;

  /**
   * The NULL ObjectID
   */
  public final static GarbageCollectionID NULL_ID = new GarbageCollectionID();

  /**
   * Create a "null" GarbageCollectionID.
   */
  private GarbageCollectionID() {
    super();
    uuid = NULL_UUID;
  }

  /**
   * Create an GarbageCollectionID with the specified ID
   * 
   * @param id The id value, &gt;= 0
   * @param uuid identifier
   */
  public GarbageCollectionID(long id, String uuid) {
    super(id);
    this.uuid = uuid;
  }

  public String getUUID() {
    return uuid;
  }

  public String getIdentifier() {
    return uuid + ":" + toLong();
  }

  @Override
  public String getIdentifierType() {
    return "GarbageCollectionID";
  }

  @Override
  public String toString() {
    return getIdentifierType() + "=" + "[" + getIdentifier() + "]";
  }

  @Override
  public int hashCode() {
    return getIdentifier().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof GarbageCollectionID) {
      GarbageCollectionID id = (GarbageCollectionID) obj;
      return getUUID().equals(id.getUUID()) && toLong() == id.toLong();
    }
    return false;
  }

}
