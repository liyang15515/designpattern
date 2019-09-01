package com.yiche.constructpattern.secondProxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author yanglee
 * @Date 2019-08-26 10:27
 * @Description TODO 动态处理器：
    在动态代理中我们不再需要再手动的创建代理类，我们只需要编写一个动态处理器就可以了。
    真正的代理对象由JDK再运行时为我们动态的来创建。
 * @Version 1.0
 **/
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备");
        Object result = method.invoke(object, args);
        System.out.println("买房后装修");
        return result;    }
}
