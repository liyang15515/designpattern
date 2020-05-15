package com.yiche.createpattern.firstsingleton;

/**
 * @Author yanglee
 * @Date 2019-08-19 00:02
 * @Description TODO 2、懒汉式单例改进版（同步锁单例模式）
        用synchronized代码块来解决线程安全,
        缺点：代码块同一时刻，只能被一个线程执行！
 * @Version 1.0
 **/
public class SingletonLazy21 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static volatile SingletonLazy21 instance = null;
    /* 私有构造方法，防止被实例化 */
    private SingletonLazy21(){

    }
    /* 1:懒汉式，静态工程方法，创建实例 */
    public static SingletonLazy21 getInstance(){
        synchronized(SingletonLazy21.class){
            if(instance == null){
                instance = new SingletonLazy21();
            }
        }
        return instance;
    }
    public void doSomething(){
        System.out.println("懒汉单例在do something。。。");
    }
}
