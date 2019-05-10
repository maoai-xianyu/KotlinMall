// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.goods.injection.module;

import com.kotlin.goods.service.CartService;
import com.kotlin.goods.service.impl.CartServiceImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class CartModule_ProvideCartserviceFactory implements Factory<CartService> {
  private final CartModule module;

  private final Provider<CartServiceImpl> cartServiceProvider;

  public CartModule_ProvideCartserviceFactory(
      CartModule module, Provider<CartServiceImpl> cartServiceProvider) {
    assert module != null;
    this.module = module;
    assert cartServiceProvider != null;
    this.cartServiceProvider = cartServiceProvider;
  }

  @Override
  public CartService get() {
    return Preconditions.checkNotNull(
        module.provideCartservice(cartServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CartService> create(
      CartModule module, Provider<CartServiceImpl> cartServiceProvider) {
    return new CartModule_ProvideCartserviceFactory(module, cartServiceProvider);
  }
}
