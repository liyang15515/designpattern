package com.yiche.constructpattern.thirdDecorator.zhuangshiPattern;

/**
 * @Author yanglee
 * @Date 2019-08-26 15:57
 * @Description TODO 具体装饰类
 * @Version 1.0
 **/
public class ConcreteDecorator  extends Decorator {

    public ConcreteDecorator(Component component) {

        super(component);
    }

    public void biu() {

        System.out.println("ready?go!");
        this.component.biu();
    }
}