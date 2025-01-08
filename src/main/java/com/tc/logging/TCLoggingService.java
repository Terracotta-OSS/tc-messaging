/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
 */
package com.tc.logging;

public interface TCLoggingService {

  TCLogger getLogger(String name);

  TCLogger getLogger(Class c);


}
