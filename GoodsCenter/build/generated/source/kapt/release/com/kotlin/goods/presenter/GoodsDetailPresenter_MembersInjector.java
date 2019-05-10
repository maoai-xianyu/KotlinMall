// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.goods.presenter;

import android.content.Context;
import com.kotlin.base.presenter.BasePresenter;
import com.kotlin.goods.service.CartService;
import com.kotlin.goods.service.GoodsService;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class GoodsDetailPresenter_MembersInjector
    implements MembersInjector<GoodsDetailPresenter> {
  private final Provider<LifecycleProvider<?>> lifecycleProvider;

  private final Provider<Context> contextProvider;

  private final Provider<GoodsService> goodsServiceProvider;

  private final Provider<CartService> cartServiceProvider;

  public GoodsDetailPresenter_MembersInjector(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<GoodsService> goodsServiceProvider,
      Provider<CartService> cartServiceProvider) {
    assert lifecycleProvider != null;
    this.lifecycleProvider = lifecycleProvider;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert goodsServiceProvider != null;
    this.goodsServiceProvider = goodsServiceProvider;
    assert cartServiceProvider != null;
    this.cartServiceProvider = cartServiceProvider;
  }

  public static MembersInjector<GoodsDetailPresenter> create(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<GoodsService> goodsServiceProvider,
      Provider<CartService> cartServiceProvider) {
    return new GoodsDetailPresenter_MembersInjector(
        lifecycleProvider, contextProvider, goodsServiceProvider, cartServiceProvider);
  }

  @Override
  public void injectMembers(GoodsDetailPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BasePresenter) instance).lifecycleProvider = lifecycleProvider.get();
    ((BasePresenter) instance).context = contextProvider.get();
    instance.goodsService = goodsServiceProvider.get();
    instance.cartService = cartServiceProvider.get();
  }
}
