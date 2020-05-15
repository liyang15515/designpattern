package com.yiche.createpattern.firstsingleton;

/**
 * @Author yanglee
 * @Date 2019-08-22 21:51
 * @Description TODO 1、懒加载的线程不安全模型
            优点：延迟加载（需要的时候才去加载）,适合单线程操作
            缺点： 线程不安全，在多线程中很容易出现不同步的情况，如在数据库对象进行的频繁读写操作时。
 * @Version 1.0
 **/
public class SingletonLazyTest {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println("singletonLazy的hashcode值："+singletonLazy.hashCode());
        singletonLazy.doSomething();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println("singletonLazy1的hashcode值："+singletonLazy1.hashCode());
        singletonLazy1.doSomething();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println("singletonLazy2的hashcode值："+singletonLazy2.hashCode());
        singletonLazy2.doSomething();
        System.out.println("/////////////////////////////SingletonLazy2//////////////////////////////");
        SingletonLazy2 singletonLazy21 = SingletonLazy2.getInstance();
        SingletonLazy2 singletonLazy22 = SingletonLazy2.getInstance();
        System.out.println("singletonLazy21的hashcode值："+singletonLazy21.hashCode());
        System.out.println("singletonLazy22的hashcode值："+singletonLazy22.hashCode());
        System.out.println("/////////////////////////////SingletonLazy21//////////////////////////////");
        SingletonLazy21 singletonLazy211 = SingletonLazy21.getInstance();
        SingletonLazy21 singletonLazy212 = SingletonLazy21.getInstance();
        System.out.println("singletonLazy211的hashcode值："+singletonLazy211.hashCode());
        System.out.println("singletonLazy212的hashcode值："+singletonLazy212.hashCode());
        System.out.println("/////////////////////////////SingletonLazy3//////////////////////////////");
        SingletonLazy3 singletonLazy31 = SingletonLazy3.getInstance();
        SingletonLazy3 singletonLazy32 = SingletonLazy3.getInstance();
        System.out.println("singletonLazy31的hashcode值："+singletonLazy31.hashCode());
        System.out.println("singletonLazy32的hashcode值："+singletonLazy32.hashCode());

    }
}
