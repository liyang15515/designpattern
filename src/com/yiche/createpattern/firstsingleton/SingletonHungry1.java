package com.yiche.createpattern.firstsingleton;

/**
 * @Author yanglee
 * @Date 2019-08-22 22:40
 * @Description TODO 饿汉单例模式（无锁的线程安全模式）
            饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，
            以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
        备注：饿汉单例，也可以用内部类或枚举的方式来实现。如SingletonHungry1
    优点：延迟加载，线程安全（java中class加载时互斥的），也减少了内存消耗，推荐使用内部类方式。
 * @Version 1.0
 **/
public class SingletonHungry1 {
    private SingletonHungry1(){

    }
    private static class SingletonHolder{
        private static SingletonHungry1 instance = new SingletonHungry1();
    }
    public static SingletonHungry1 getInstance(){
        return SingletonHolder.instance;
    }
    public void doSomething(){
        System.out.println("饿汉单例在do something。。。");
    }
}
