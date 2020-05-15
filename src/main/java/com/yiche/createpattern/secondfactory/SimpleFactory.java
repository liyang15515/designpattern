package com.yiche.createpattern.secondfactory;

import com.yiche.createpattern.secondfactory.simplefactory.Bike;
import com.yiche.createpattern.secondfactory.simplefactory.Car;
import com.yiche.createpattern.secondfactory.simplefactory.Truck;
import com.yiche.createpattern.secondfactory.simplefactory.Vehicle;

/**
 * @Author yanglee
 * @Date 2019-08-21 14:12
 * @Description TODO 1、简单工厂模式（又叫"静态工厂模式"）
            特点

            1 它是一个具体的类，非接口 抽象类。有一个重要的create()方法，利用if或者 switch创建产品并返回。

            2 create()方法通常是静态的，所以也称之为静态工厂。

            缺点

            1 扩展性差（我想增加一种面条，除了新增一个面条产品类，还需要修改工厂类方法）

            2 不同的产品需要不同额外参数的时候 不支持。

 * @Version 1.0
 **/
public class SimpleFactory {

    public enum VehicleType{
        Bike,Car,Truck;
    }
    public static Vehicle create(VehicleType type){
//        Vehicle vehicle;
//        switch(type){
//            case VehicleType.Bike:
//                vehicle = new Bike();
//                break;
//        }
        if(type.equals(VehicleType.Bike)){
            return new Bike();
        }
        if(type.equals(VehicleType.Car)){
            return new Car();
        }
        if(type.equals(VehicleType.Truck)){
            return new Truck();
        }
        return null;
    }
}
