package com.yiche.createpattern.secondfactory.simplefactory;

/**
 * @Author yanglee
 * @Date 2019-08-21 14:40
 * @Description TODO 定义具体的实现类---》单车
 * @Version 1.0
 **/
public class Bike implements Vehicle{
    @Override
    public String desc(String name) {
        return name+"的自行车";
    }
}
