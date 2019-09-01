package com.yiche.createpattern.secondfactory;

import com.yiche.createpattern.secondfactory.factorymethod.CarFactory;
import com.yiche.createpattern.secondfactory.factorymethod.TruckFactory;
import com.yiche.createpattern.secondfactory.factorymethod.VehicleFactory;
import com.yiche.createpattern.secondfactory.simplefactory.Vehicle;

/**
 * @Author yanglee
 * @Date 2019-08-21 16:16
 * @Description TODO 2、工厂方法模式 测试类
            工厂方法：多个工厂类，一个产品抽象类。
            生活中的: 一个麦当劳店，可以生产多种汉堡。一个肯德基店，也可以生产多种汉
 * @Version 1.0
 **/
public class MethodFactoryTest {
    public static void main(String[] args){
        VehicleFactory vehicleFactory = new CarFactory();
        Vehicle vehicle = vehicleFactory.createVehicle("small");
        String str = vehicle.desc("liyang");
        System.out.println(str);
        vehicleFactory = new TruckFactory();
        vehicle = vehicleFactory.createVehicle("large");
        str = vehicle.desc("yanfang");
        System.out.println(str);
    }
}
