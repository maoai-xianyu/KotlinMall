// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.order.data.repository;

import dagger.internal.Factory;

public final class ShipAddressRepository_Factory implements Factory<ShipAddressRepository> {
  private static final ShipAddressRepository_Factory INSTANCE = new ShipAddressRepository_Factory();

  @Override
  public ShipAddressRepository get() {
    return new ShipAddressRepository();
  }

  public static Factory<ShipAddressRepository> create() {
    return INSTANCE;
  }
}
