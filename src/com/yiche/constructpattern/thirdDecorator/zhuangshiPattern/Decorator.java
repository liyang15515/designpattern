package com.yiche.constructpattern.thirdDecorator.zhuangshiPattern;

/**
 * @Author yanglee
 * @Date 2019-08-26 15:56
 * @Description TODO 装饰类
 * @Version 1.0
 **/
public class Decorator implements Component {

    public Component component;

    public Decorator(Component component) {

        this.component = component;
    }

    public void biu() {

        this.component.biu();
    }
}