package com.yiche.createpattern.firstsingleton;

/**
 * @Author yanglee
 * @Date 2019-08-22 22:40
 * @Description TODO 饿汉单例模式（无锁的线程安全模式）
            饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，
            以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
        备注：饿汉单例，也可以用内部类或枚举的方式来实现。如SingletonHungry1
 * @Version 1.0
 **/
public class SingletonHungry {
    private static final SingletonHungry instance = new SingletonHungry();
    private SingletonHungry(){

    }
    public static SingletonHungry getInstance(){
        return instance;
    }
    public void doSomething(){
        System.out.println("饿汉单例在do something。。。");
    }
}
