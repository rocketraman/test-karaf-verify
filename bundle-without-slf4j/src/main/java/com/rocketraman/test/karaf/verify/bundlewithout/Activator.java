package com.rocketraman.test.karaf.verify.bundlewithout;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

  @Override
  public void start(final BundleContext bundleContext) throws Exception {
    System.out.println("Bundle without slf4j started.");
  }
  @Override
  public void stop(final BundleContext bundleContext) throws Exception {
    System.out.println("Bundle without slf4j stopped.");
  }
}
