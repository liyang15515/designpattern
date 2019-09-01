package com.yiche.constructpattern.thirdDecorator.demoPattern;

/**
 * @Author yanglee
 * @Date 2019-08-26 15:54
 * @Description TODO
 * @Version 1.0
 **/
public class DecoratorTest2 {
    public static void main(String[] args) {
        Component2 component = new ConcreteComponent2();
        component.Operation();

        System.out.println("---------华丽丽的分割线---------");

        Component2 component1 = new ConcreteDecoratorA(new ConcreteComponent2());
        component1.Operation();

        System.out.println("---------华丽丽的分割线---------");

        Component2 component2 = new ConcreteDecoratorB(new ConcreteComponent2());
        component2.Operation();

    }
}
