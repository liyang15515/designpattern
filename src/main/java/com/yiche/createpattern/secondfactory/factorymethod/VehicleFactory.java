package com.yiche.createpattern.secondfactory.factorymethod;

import com.yiche.createpattern.secondfactory.simplefactory.Vehicle;

/**
 * @Author yanglee
 * @Date 2019-08-21 19:32
 * @Description TODO 抽象的工厂类
 * @Version 1.0
 **/
public interface VehicleFactory {
    Vehicle createVehicle(String size);
}
