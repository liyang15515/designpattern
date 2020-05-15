package com.yiche.createpattern.firstsingleton;

/**
 * @Author yanglee
 * @Date 2019-08-19 00:02
 * @Description TODO 1、懒汉式单例（拥有双重校验锁机制的"同步锁单例模式"）
        解决问题：只有在实例未被创建的情况下，同步锁才起作用。如果实例存在，可以多个线程并发访问获取实例。
        对instance == null做了两次校验判空，故称"双重校验机制的同步锁单例模式"
    优点：延迟加载，线程安全
    缺点： 写法复杂，不简洁
 * @Version 1.0
 **/
public class SingletonLazy3 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static volatile SingletonLazy3 instance = null;
    /* 私有构造方法，防止被实例化 */
    private SingletonLazy3(){

    }
    /* 1:懒汉式，静态工程方法，创建实例 */
    public static SingletonLazy3 getInstance(){
        if(instance == null){
            synchronized (SingletonLazy3.class) {
                if (instance == null) {
                    instance = new SingletonLazy3();
                }
            }
        }
        return instance;
    }
    public void doSomething(){
        System.out.println("懒汉单例在do something。。。");
    }
}
