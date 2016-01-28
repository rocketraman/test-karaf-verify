package com.rocketraman.test.karaf.verify.bundlewith;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator {

  public static final Logger log = LoggerFactory.getLogger(Activator.class);

  @Override
  public void start(final BundleContext bundleContext) throws Exception {
    System.out.println("Bundle with slf4j started.");
    log.warn("Bundle with slf4j started.");
  }
  @Override
  public void stop(final BundleContext bundleContext) throws Exception {
    System.out.println("Bundle with slf4j stopped.");
    log.warn("Bundle with slf4j stopped.");
  }
}
