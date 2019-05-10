package com.kotlin.goods.service.impl;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J&\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f0\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f0\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/kotlin/goods/service/impl/GoodsServiceImpl;", "Lcom/kotlin/goods/service/GoodsService;", "()V", "repository", "Lcom/kotlin/goods/data/repository/GoodsRepository;", "getRepository", "()Lcom/kotlin/goods/data/repository/GoodsRepository;", "setRepository", "(Lcom/kotlin/goods/data/repository/GoodsRepository;)V", "getGoodsDetail", "Lrx/Observable;", "Lcom/kotlin/goods/data/protocol/Goods;", "goodsId", "", "getGoodsList", "", "categoryId", "pageNo", "getGoodsListByKeyword", "keyword", "", "GoodsCenter_debug"})
public final class GoodsServiceImpl implements com.kotlin.goods.service.GoodsService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.goods.data.repository.GoodsRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.data.repository.GoodsRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.data.repository.GoodsRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.util.List<com.kotlin.goods.data.protocol.Goods>> getGoodsList(int categoryId, int pageNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.util.List<com.kotlin.goods.data.protocol.Goods>> getGoodsListByKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, int pageNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<com.kotlin.goods.data.protocol.Goods> getGoodsDetail(int goodsId) {
        return null;
    }
    
    @javax.inject.Inject()
    public GoodsServiceImpl() {
        super();
    }
}