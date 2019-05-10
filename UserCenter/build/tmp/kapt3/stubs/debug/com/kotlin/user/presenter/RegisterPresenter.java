package com.kotlin.user.presenter;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/kotlin/user/presenter/RegisterPresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/user/presenter/view/RegisterView;", "()V", "userService", "Lcom/kotlin/user/service/UserService;", "getUserService", "()Lcom/kotlin/user/service/UserService;", "setUserService", "(Lcom/kotlin/user/service/UserService;)V", "register", "", "mobile", "", "pwd", "verifyCode", "UserCenter_debug"})
public final class RegisterPresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.user.presenter.view.RegisterView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.user.service.UserService userService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.user.service.UserService getUserService() {
        return null;
    }
    
    public final void setUserService(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.service.UserService p0) {
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyCode) {
    }
    
    @javax.inject.Inject()
    public RegisterPresenter() {
        super();
    }
}