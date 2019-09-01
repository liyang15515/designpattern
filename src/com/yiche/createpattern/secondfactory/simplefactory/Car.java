package com.yiche.createpattern.secondfactory.simplefactory;

/**
 * @Author yanglee
 * @Date 2019-08-21 14:42
 * @Description TODO 定义具体的实现类--》汽车
 * @Version 1.0
 **/
public class Car implements Vehicle{
    @Override
    public String desc(String name) {
        return name+"的汽车";
    }
}
