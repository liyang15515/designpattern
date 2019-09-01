package com.yiche.createpattern.secondfactory.abstractfactory;

/**
 * @Author yanglee
 * @Date 2019-08-21 21:47
 * @Description TODO
 * @Version 1.0
 **/
public class LargeFactory extends AbstractFactory {
    @Override
    public AbstractBus createBus() {
        return new LargeBus();
    }

    @Override
    public AbstractCar createCar() {
        return new LargeCar();
    }
}
