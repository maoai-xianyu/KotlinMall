// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.order.presenter;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class OrderListPresenter_Factory implements Factory<OrderListPresenter> {
  private final MembersInjector<OrderListPresenter> orderListPresenterMembersInjector;

  public OrderListPresenter_Factory(
      MembersInjector<OrderListPresenter> orderListPresenterMembersInjector) {
    assert orderListPresenterMembersInjector != null;
    this.orderListPresenterMembersInjector = orderListPresenterMembersInjector;
  }

  @Override
  public OrderListPresenter get() {
    return MembersInjectors.injectMembers(
        orderListPresenterMembersInjector, new OrderListPresenter());
  }

  public static Factory<OrderListPresenter> create(
      MembersInjector<OrderListPresenter> orderListPresenterMembersInjector) {
    return new OrderListPresenter_Factory(orderListPresenterMembersInjector);
  }
}