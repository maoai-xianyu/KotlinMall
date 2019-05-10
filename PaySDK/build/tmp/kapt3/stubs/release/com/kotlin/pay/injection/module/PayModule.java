package com.kotlin.pay.injection.module;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/kotlin/pay/injection/module/PayModule;", "", "()V", "providePayService", "Lcom/kotlin/pay/service/PayService;", "payService", "Lcom/kotlin/pay/service/impl/PayServiceImpl;", "PaySDK_release"})
@dagger.Module()
public final class PayModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.kotlin.pay.service.PayService providePayService(@org.jetbrains.annotations.NotNull()
    com.kotlin.pay.service.impl.PayServiceImpl payService) {
        return null;
    }
    
    public PayModule() {
        super();
    }
}