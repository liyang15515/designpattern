package com.yiche.createpattern.firstsingleton;

/**
 * @Author yanglee
 * @Date 2019-08-22 22:53
 * @Description TODO
 * @Version 1.0
 **/
public class SingletonHungaryTest {
    public static void main(String[] args) {
        SingletonHungry singletonHungry1 = SingletonHungry.getInstance();
        SingletonHungry singletonHungry2 = SingletonHungry.getInstance();
        SingletonHungry singletonHungry3 = SingletonHungry.getInstance();
        System.out.println("singletonHungry1的hashcode值："+singletonHungry1.hashCode());
        System.out.println("singletonHungry2的hashcode值："+singletonHungry2.hashCode());
        System.out.println("singletonHungry3的hashcode值："+singletonHungry3.hashCode());
        System.out.println("///////////////////////SingletonHungry1//////////////////////////");
        SingletonHungry1 singletonHungry11 = SingletonHungry1.getInstance();
        SingletonHungry1 singletonHungry12 = SingletonHungry1.getInstance();
        SingletonHungry1 singletonHungry13 = SingletonHungry1.getInstance();
        System.out.println("singletonHungry11的hashcode值："+singletonHungry11.hashCode());
        System.out.println("singletonHungry12的hashcode值："+singletonHungry12.hashCode());
        System.out.println("singletonHungry13的hashcode值："+singletonHungry13.hashCode());
    }
}
