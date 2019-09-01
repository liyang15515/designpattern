package com.yiche.createpattern.secondfactory.factorymethod;

import com.yiche.createpattern.secondfactory.simplefactory.Vehicle;

/**
 * @Author yanglee
 * @Date 2019-08-21 19:38
 * @Description TODO 定义具体的实现类---》大型轿车
 * @Version 1.0
 **/
public class SedanCar implements Vehicle {
    @Override
    public String desc(String name) {
        return name+"生产的大型轿车";
    }
}
