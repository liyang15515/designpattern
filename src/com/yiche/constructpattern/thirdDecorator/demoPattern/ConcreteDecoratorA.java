package com.yiche.constructpattern.thirdDecorator.demoPattern;

/**
 * @Author yanglee
 * @Date 2019-08-26 16:06
 * @Description TODO 具体的装饰产品类，起到给Component添加职责的功能
 * @Version 1.0
 **/
public class ConcreteDecoratorA extends Decorator{

    //本类的独有属性，区别于ConcreteDecoratorB
    private String addedState;

    public ConcreteDecoratorA(Component2 component) {
        super(component);
    }

    @Override
    public void Operation() {
        System.out.println("This is ConcreteDecoratorA");
        component.Operation();
        addedState = "装饰了A";
        System.out.println(addedState);
    }

}
