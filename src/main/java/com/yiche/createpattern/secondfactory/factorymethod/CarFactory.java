package com.yiche.createpattern.secondfactory.factorymethod;


import com.yiche.createpattern.secondfactory.simplefactory.Vehicle;

/**
 * @Author yanglee
 * @Date 2019-08-21 19:35
 * @Description TODO 具体的工厂实现类--》CarFactory
 * @Version 1.0
 **/
public class CarFactory implements  VehicleFactory {
    @Override
    public Vehicle createVehicle(String size) {
        if(size.equals("small")){
            return new SportCar();
        }
        if (size.equals("large")){
            return new SedanCar();
        }
        return null;
    }
}
