package com.yiche.createpattern.firstsingleton;

/**
 * @Author yanglee
 * @Date 2019-08-19 00:02
 * @Description TODO 2、懒汉式单例改进版（同步锁单例模式）
            解决途径：在getInstance()方法上添加synchronized关键字以保证安全，
            其实可以将synchronized加在方法中代码块上面。如SingletonLazy21
        缺点：同一时刻只能有一个线程能访问getInstance（）方法
 * @Version 1.0
 **/
public class SingletonLazy2 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static volatile SingletonLazy2 instance = null;
    /* 私有构造方法，防止被实例化 */
    private SingletonLazy2(){

    }
    /* 1:懒汉式，静态工程方法，创建实例 */
    public static synchronized SingletonLazy2 getInstance(){
        if(instance == null){
            instance = new SingletonLazy2();
        }
        return instance;
    }
    public void doSomething(){
        System.out.println("懒汉单例在do something。。。");
    }
}
