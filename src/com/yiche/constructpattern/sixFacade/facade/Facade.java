package com.yiche.constructpattern.sixFacade.facade;

/**
 * @Author yanglee
 * @Date 2019-08-26 21:20
 * @Description TODO 外观角色
 * @Version 1.0
 **/
public class Facade {
    private SubSystem01 obj1=new SubSystem01();
    private SubSystem02 obj2=new SubSystem02();
    private SubSystem03 obj3=new SubSystem03();
    public void method()
    {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
