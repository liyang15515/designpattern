package com.yiche.constructpattern.sixFacade;

/**
 * @Author yanglee
 * @Date 2019-08-26 21:16
 * @Description TODO 门面测试类
 * @Version 1.0
 **/
public class UserTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
