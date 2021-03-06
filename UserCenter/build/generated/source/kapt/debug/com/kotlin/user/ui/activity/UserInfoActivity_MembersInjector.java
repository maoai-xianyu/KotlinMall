// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.user.ui.activity;

import com.kotlin.base.ui.activity.BaseTakePhotoActivity;
import com.kotlin.user.presenter.UserInfoPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class UserInfoActivity_MembersInjector implements MembersInjector<UserInfoActivity> {
  private final Provider<UserInfoPresenter> mPresenterProvider;

  public UserInfoActivity_MembersInjector(Provider<UserInfoPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<UserInfoActivity> create(
      Provider<UserInfoPresenter> mPresenterProvider) {
    return new UserInfoActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(UserInfoActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseTakePhotoActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
