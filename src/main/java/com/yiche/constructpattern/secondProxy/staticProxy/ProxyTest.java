package com.yiche.constructpattern.secondProxy.staticProxy;

/**
 * @Author yanglee
 * @Date 2019-08-25 18:42
 * @Description TODO 静态代理
        优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
        缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。
 * @Version 1.0
 **/
public class ProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHosue();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHosue();
    }
}
