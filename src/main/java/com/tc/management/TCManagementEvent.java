/*
 * Copyright 2003-2008 Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.management;

import java.io.Serializable;

/**
 * @author Ludovic Orban
 */
public class TCManagementEvent implements Serializable {

  private Serializable payload;
  private String type;

  public TCManagementEvent() {
  }

  public TCManagementEvent(Serializable payload, String type) {
    this.payload = payload;
    this.type = type;
  }

  public Serializable getPayload() {
    return payload;
  }

  public void setPayload(Serializable payload) {
    this.payload = payload;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
