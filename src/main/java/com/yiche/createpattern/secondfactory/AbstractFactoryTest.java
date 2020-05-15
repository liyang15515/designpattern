package com.yiche.createpattern.secondfactory;

import com.yiche.createpattern.secondfactory.abstractfactory.*;

/**
 * @Author yanglee
 * @Date 2019-08-21 20:32
 * @Description TODO 3、抽象工厂模式
                抽象工厂：多个工厂类，多个产品抽象类。
                生活中的：百胜餐饮集团下有肯德基和百事公司，肯德基生产汉堡，百事公司生成百事可乐。
 * @Version 1.0
 **/
public class AbstractFactoryTest {
        public static void main(String[] args) {
            AbstractFactory factory = new LargeFactory();
            AbstractBus bus = factory.createBus();
            bus.show();
            AbstractCar car = factory.createCar();
            car.show();
            //////////////////////////////////////
            System.out.println("/////////////////////////");
            factory = new SmallFactory();
            bus = factory.createBus();
            car = factory.createCar();
            bus.show();
            car.show();
        }
}
