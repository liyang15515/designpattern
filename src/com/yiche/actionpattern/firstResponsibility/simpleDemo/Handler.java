package com.yiche.actionpattern.firstResponsibility.simpleDemo;

/**
 * @Author yanglee
 * @Date 2019-08-23 16:05
 * @Description TODO 抽象处理器
 * @Version 1.0
 **/
public abstract class Handler {
    //下一个处理器
    private Handler nextHandler;

    //处理方法
    public abstract void handleRequest();

    public Handler getNextHandler() {
        return nextHandler;
    }
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
