/*
 * Copyright 2003-2009 Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.loaders;

/**
 * Manage loading relationship between named classloaders and classes
 */
public interface ClassProvider {

  /**
   * Given a class name, load the class
   * 
   * @param className Class name
   * @return Class
   * @throws ClassNotFoundException If class not found through loader
   */
  Class getClassFor(String className) throws ClassNotFoundException;

}
