package com.yiche.createpattern.secondfactory.factorymethod;

import com.yiche.createpattern.secondfactory.simplefactory.Vehicle;

/**
 * @Author yanglee
 * @Date 2019-08-21 19:36
 * @Description TODO 具体的工厂实现类--》TruckFactory，生产卡车
 * @Version 1.0
 **/
public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String size) {
        if("small".equals(size)){
            return new SmallTruck();
        }
        if("large".equals(size)){
            return new LargeTruck();
        }
        return null;
    }
}
