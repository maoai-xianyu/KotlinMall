// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.user.injection.module;

import com.kotlin.user.service.UploadService;
import com.kotlin.user.service.impl.UploadServiceImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class UploadModule_ProvideUploadServiceFactory implements Factory<UploadService> {
  private final UploadModule module;

  private final Provider<UploadServiceImpl> uploadServiceProvider;

  public UploadModule_ProvideUploadServiceFactory(
      UploadModule module, Provider<UploadServiceImpl> uploadServiceProvider) {
    assert module != null;
    this.module = module;
    assert uploadServiceProvider != null;
    this.uploadServiceProvider = uploadServiceProvider;
  }

  @Override
  public UploadService get() {
    return Preconditions.checkNotNull(
        module.provideUploadService(uploadServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UploadService> create(
      UploadModule module, Provider<UploadServiceImpl> uploadServiceProvider) {
    return new UploadModule_ProvideUploadServiceFactory(module, uploadServiceProvider);
  }
}
