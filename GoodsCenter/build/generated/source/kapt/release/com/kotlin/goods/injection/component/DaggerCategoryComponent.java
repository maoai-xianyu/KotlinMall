// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.goods.injection.component;

import android.content.Context;
import com.kotlin.base.injection.component.ActivityComponent;
import com.kotlin.goods.data.repository.CategoryRepository_Factory;
import com.kotlin.goods.injection.module.CategoryModule;
import com.kotlin.goods.injection.module.CategoryModule_ProvideCategoryServiceFactory;
import com.kotlin.goods.presenter.CategoryPresenter;
import com.kotlin.goods.presenter.CategoryPresenter_Factory;
import com.kotlin.goods.presenter.CategoryPresenter_MembersInjector;
import com.kotlin.goods.service.CategoryService;
import com.kotlin.goods.service.impl.CategoryServiceImpl;
import com.kotlin.goods.service.impl.CategoryServiceImpl_Factory;
import com.kotlin.goods.service.impl.CategoryServiceImpl_MembersInjector;
import com.kotlin.goods.ui.fragment.CategoryFragment;
import com.kotlin.goods.ui.fragment.CategoryFragment_MembersInjector;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerCategoryComponent implements CategoryComponent {
  private Provider<LifecycleProvider<?>> lifecycleProvider;

  private Provider<Context> contextProvider;

  private MembersInjector<CategoryServiceImpl> categoryServiceImplMembersInjector;

  private Provider<CategoryServiceImpl> categoryServiceImplProvider;

  private Provider<CategoryService> provideCategoryServiceProvider;

  private MembersInjector<CategoryPresenter> categoryPresenterMembersInjector;

  private Provider<CategoryPresenter> categoryPresenterProvider;

  private MembersInjector<CategoryFragment> categoryFragmentMembersInjector;

  private DaggerCategoryComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.lifecycleProvider =
        new com_kotlin_base_injection_component_ActivityComponent_lifecycleProvider(
            builder.activityComponent);

    this.contextProvider =
        new com_kotlin_base_injection_component_ActivityComponent_context(
            builder.activityComponent);

    this.categoryServiceImplMembersInjector =
        CategoryServiceImpl_MembersInjector.create(CategoryRepository_Factory.create());

    this.categoryServiceImplProvider =
        CategoryServiceImpl_Factory.create(categoryServiceImplMembersInjector);

    this.provideCategoryServiceProvider =
        CategoryModule_ProvideCategoryServiceFactory.create(
            builder.categoryModule, categoryServiceImplProvider);

    this.categoryPresenterMembersInjector =
        CategoryPresenter_MembersInjector.create(
            lifecycleProvider, contextProvider, provideCategoryServiceProvider);

    this.categoryPresenterProvider =
        CategoryPresenter_Factory.create(categoryPresenterMembersInjector);

    this.categoryFragmentMembersInjector =
        CategoryFragment_MembersInjector.create(categoryPresenterProvider);
  }

  @Override
  public void inject(CategoryFragment fragment) {
    categoryFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private CategoryModule categoryModule;

    private ActivityComponent activityComponent;

    private Builder() {}

    public CategoryComponent build() {
      if (categoryModule == null) {
        this.categoryModule = new CategoryModule();
      }
      if (activityComponent == null) {
        throw new IllegalStateException(
            ActivityComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerCategoryComponent(this);
    }

    public Builder categoryModule(CategoryModule categoryModule) {
      this.categoryModule = Preconditions.checkNotNull(categoryModule);
      return this;
    }

    public Builder activityComponent(ActivityComponent activityComponent) {
      this.activityComponent = Preconditions.checkNotNull(activityComponent);
      return this;
    }
  }

  private static class com_kotlin_base_injection_component_ActivityComponent_lifecycleProvider
      implements Provider<LifecycleProvider<?>> {
    private final ActivityComponent activityComponent;

    com_kotlin_base_injection_component_ActivityComponent_lifecycleProvider(
        ActivityComponent activityComponent) {
      this.activityComponent = activityComponent;
    }

    @Override
    public LifecycleProvider<?> get() {
      return Preconditions.checkNotNull(
          activityComponent.lifecycleProvider(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_kotlin_base_injection_component_ActivityComponent_context
      implements Provider<Context> {
    private final ActivityComponent activityComponent;

    com_kotlin_base_injection_component_ActivityComponent_context(
        ActivityComponent activityComponent) {
      this.activityComponent = activityComponent;
    }

    @Override
    public Context get() {
      return Preconditions.checkNotNull(
          activityComponent.context(), "Cannot return null from a non-@Nullable component method");
    }
  }
}
