/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.logging;

public interface TCLoggingService {

  TCLogger getLogger(String name);

  TCLogger getLogger(Class c);


}
