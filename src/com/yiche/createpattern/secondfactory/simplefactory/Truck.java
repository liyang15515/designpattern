package com.yiche.createpattern.secondfactory.simplefactory;

/**
 * @Author yanglee
 * @Date 2019-08-21 14:48
 * @Description TODO 定义具体的实现类---》卡车
 * @Version 1.0
 **/
public class Truck implements Vehicle {
    @Override
    public String desc(String name) {
        return name+"的卡车";
    }
}
