package com.yiche.actionpattern.firstResponsibility.simpleDemo;

/**
 * @Author yanglee
 * @Date 2019-08-23 16:08
 * @Description TODO 客户端
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();
        h1.setNextHandler(h2);   //h1的下一个处理器是h2
        h1.handleRequest();
    }
}
