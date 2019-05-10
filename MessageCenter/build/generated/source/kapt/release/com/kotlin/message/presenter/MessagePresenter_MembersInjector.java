// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.message.presenter;

import android.content.Context;
import com.kotlin.base.presenter.BasePresenter;
import com.kotlin.message.service.MessageService;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MessagePresenter_MembersInjector implements MembersInjector<MessagePresenter> {
  private final Provider<LifecycleProvider<?>> lifecycleProvider;

  private final Provider<Context> contextProvider;

  private final Provider<MessageService> messageServiceProvider;

  public MessagePresenter_MembersInjector(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<MessageService> messageServiceProvider) {
    assert lifecycleProvider != null;
    this.lifecycleProvider = lifecycleProvider;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert messageServiceProvider != null;
    this.messageServiceProvider = messageServiceProvider;
  }

  public static MembersInjector<MessagePresenter> create(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<MessageService> messageServiceProvider) {
    return new MessagePresenter_MembersInjector(
        lifecycleProvider, contextProvider, messageServiceProvider);
  }

  @Override
  public void injectMembers(MessagePresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BasePresenter) instance).lifecycleProvider = lifecycleProvider.get();
    ((BasePresenter) instance).context = contextProvider.get();
    instance.messageService = messageServiceProvider.get();
  }
}
