package com.yiche.createpattern.secondfactory;

import com.yiche.createpattern.secondfactory.simplefactory.Vehicle;

/**
 * @Author yanglee
 * @Date 2019-08-21 14:58
 * @Description TODO 静态工厂测试类
        简单工厂：一个工厂类，一个产品抽象类。
        生活中的：一个麦当劳店，可以生产多种汉堡。
 * @Version 1.0
 **/
public class SimpleFactoryTest {
    public static void main(String[] args){
        Vehicle vehicle = SimpleFactory.create(SimpleFactory.VehicleType.Bike);
        String str = vehicle.desc("liyang生产");
        System.out.println(str);
        vehicle = SimpleFactory.create(SimpleFactory.VehicleType.Car);
         str = vehicle.desc("liyang生产");
        System.out.println(str);
    }
}
