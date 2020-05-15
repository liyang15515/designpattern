package com.yiche.constructpattern.thirdDecorator.zhuangshiPattern;

/**
 * @Author yanglee
 * @Date 2019-08-26 15:54
 * @Description TODO
 * @Version 1.0
 **/
public class DecoratorTest {
    public static void main(String[] args) {
        //使用装饰器
         Component component = new ConcreteDecorator(new ConcretComponent());
         component.biu();
    }
}
