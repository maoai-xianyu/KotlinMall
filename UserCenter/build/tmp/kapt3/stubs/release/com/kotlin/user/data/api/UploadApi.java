package com.kotlin.user.data.api;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/kotlin/user/data/api/UploadApi;", "", "getUploadToken", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "UserCenter_release"})
public abstract interface UploadApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "common/getUploadToken")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> getUploadToken();
}