/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.net.protocol.tcm.TCMessage;

public interface ClientHandshakeRefusedMessage extends TCMessage {
  String getRefualsCause();

  void initialize(String message);

}
