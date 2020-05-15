package com.yiche.createpattern.secondfactory.abstractfactory;

/**
 * @Author yanglee
 * @Date 2019-08-21 21:45
 * @Description TODO
 * @Version 1.0
 **/
public abstract class AbstractFactory {
    public abstract AbstractBus createBus();
    public abstract AbstractCar createCar();
}
