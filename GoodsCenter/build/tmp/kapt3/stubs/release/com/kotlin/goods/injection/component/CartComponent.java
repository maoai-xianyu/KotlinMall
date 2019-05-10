package com.kotlin.goods.injection.component;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/kotlin/goods/injection/component/CartComponent;", "", "inject", "", "fragment", "Lcom/kotlin/goods/ui/fragment/CartFragment;", "GoodsCenter_release"})
@dagger.Component(dependencies = {com.kotlin.base.injection.component.ActivityComponent.class}, modules = {com.kotlin.goods.injection.module.CartModule.class})
@com.kotlin.base.injection.PerComponentScope()
public abstract interface CartComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.ui.fragment.CartFragment fragment);
}