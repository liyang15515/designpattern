package com.yiche.constructpattern.thirdDecorator.demoPattern;

/**
 * @Author yanglee
 * @Date 2019-08-26 16:04
 * @Description TODO 装饰抽象类，实现了Component，
                从外类来扩展Component类的功能，但对于Component来说，是无需知道Decorator存在的。
 * @Version 1.0
 **/
public abstract class Decorator implements Component2 {

    Component2 component = null;

    //构造函数，引入component对象
    public Decorator(Component2 component) {
        this.component = component;
    }

    /**
     * 重写Operation方法
     */
    @Override
    public void Operation() {
        System.out.println("This is Decorator");
        if(component != null) {
            component.Operation();
        }
    }

}
