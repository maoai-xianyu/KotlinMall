package com.kotlin.goods.presenter.view;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/kotlin/goods/presenter/view/GoodsListView;", "Lcom/kotlin/base/presenter/view/BaseView;", "onGetGoodsListResult", "", "result", "", "Lcom/kotlin/goods/data/protocol/Goods;", "GoodsCenter_release"})
public abstract interface GoodsListView extends com.kotlin.base.presenter.view.BaseView {
    
    public abstract void onGetGoodsListResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kotlin.goods.data.protocol.Goods> result);
}