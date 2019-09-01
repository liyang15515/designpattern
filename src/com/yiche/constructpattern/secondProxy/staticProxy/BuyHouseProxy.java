package com.yiche.constructpattern.secondProxy.staticProxy;

/**
 * @Author yanglee
 * @Date 2019-08-26 10:18
 * @Description TODO 静态代理
 * @Version 1.0
 **/
public class BuyHouseProxy implements BuyHouse {
    private BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHosue() {
        System.out.println("买房前准备");
        buyHouse.buyHosue();
        System.out.println("买房后装修");

    }
}
