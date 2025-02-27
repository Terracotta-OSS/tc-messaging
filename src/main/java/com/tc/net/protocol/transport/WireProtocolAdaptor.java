/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.net.protocol.transport;

import com.tc.net.protocol.TCProtocolAdaptor;

public interface WireProtocolAdaptor extends TCProtocolAdaptor {
  // I put this here during a refactoring to test ServerStackProvider. It doesn't seem to have much to do, except to be
  // a placeholder in the type hierarchy. --Orion 12/15/05
}
