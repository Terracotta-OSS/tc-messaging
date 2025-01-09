/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.object.msg;

import com.tc.net.protocol.tcm.TCMessage;

public interface ClientHandshakeRefusedMessage extends TCMessage {
  String getRefualsCause();

  void initialize(String message);

}
