package com.yiche.constructpattern.secondProxy.dynamicProxy;

import com.yiche.constructpattern.secondProxy.staticProxy.BuyHouse;
import com.yiche.constructpattern.secondProxy.staticProxy.BuyHouseImpl;

import java.lang.reflect.Proxy;

/**
 * @Author yanglee
 * @Date 2019-08-26 10:39
 * @Description TODO 动态代理测试（JDK动态代理）
 * @Version 1.0
 **/
public class DynamicProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse buyHouseProxy = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),new Class[]{BuyHouse.class},new DynamicProxyHandler(buyHouse));
        buyHouseProxy.buyHosue();
    }
}
