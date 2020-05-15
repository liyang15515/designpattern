package com.yiche.constructpattern.thirdDecorator.demoPattern;

/**
 * @Author yanglee
 * @Date 2019-08-26 16:03
 * @Description TODO 定义了一个具体的对象，是被装饰类，也可以给这个对象添加一些职责。
 * @Version 1.0
 **/
public class ConcreteComponent2 implements Component2 {

    @Override
    public void Operation() {
        System.out.println("This is ConcreteComponent2");
    }

}
