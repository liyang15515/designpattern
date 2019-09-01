package com.yiche.createpattern.secondfactory.abstractfactory;

/**
 * @Author yanglee
 * @Date 2019-08-21 21:48
 * @Description TODO
 * @Version 1.0
 **/
public class SmallFactory extends AbstractFactory {
    @Override
    public AbstractBus createBus() {
        return new MiddleBus();
    }

    @Override
    public AbstractCar createCar() {
        return new SportCar();
    }
}
