// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.goods.service.impl;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class CategoryServiceImpl_Factory implements Factory<CategoryServiceImpl> {
  private final MembersInjector<CategoryServiceImpl> categoryServiceImplMembersInjector;

  public CategoryServiceImpl_Factory(
      MembersInjector<CategoryServiceImpl> categoryServiceImplMembersInjector) {
    assert categoryServiceImplMembersInjector != null;
    this.categoryServiceImplMembersInjector = categoryServiceImplMembersInjector;
  }

  @Override
  public CategoryServiceImpl get() {
    return MembersInjectors.injectMembers(
        categoryServiceImplMembersInjector, new CategoryServiceImpl());
  }

  public static Factory<CategoryServiceImpl> create(
      MembersInjector<CategoryServiceImpl> categoryServiceImplMembersInjector) {
    return new CategoryServiceImpl_Factory(categoryServiceImplMembersInjector);
  }
}
