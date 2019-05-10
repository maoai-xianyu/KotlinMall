package com.kotlin.order.service;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00100\u0003H&\u00a8\u0006\u0011"}, d2 = {"Lcom/kotlin/order/service/ShipAddressService;", "", "addShipAddress", "Lrx/Observable;", "", "shipUserName", "", "shipUserMobile", "shipAddress", "deleteShipAddress", "id", "", "editShipAddress", "address", "Lcom/kotlin/order/data/protocol/ShipAddress;", "getShipAddressList", "", "OrderCenter_release"})
public abstract interface ShipAddressService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> addShipAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String shipUserName, @org.jetbrains.annotations.NotNull()
    java.lang.String shipUserMobile, @org.jetbrains.annotations.NotNull()
    java.lang.String shipAddress);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.util.List<com.kotlin.order.data.protocol.ShipAddress>> getShipAddressList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> editShipAddress(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.ShipAddress address);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> deleteShipAddress(int id);
}