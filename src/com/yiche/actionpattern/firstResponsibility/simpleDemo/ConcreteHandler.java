package com.yiche.actionpattern.firstResponsibility.simpleDemo;

/**
 * @Author yanglee
 * @Date 2019-08-23 16:06
 * @Description TODO 具体处理器.
 * @Version 1.0
 **/
public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest() {
        System.out.println(this.toString()+"处理器处理");
        if (getNextHandler()!=null){   //判断是否存在下一个处理器
            getNextHandler().handleRequest();   //存在则调用下一个处理器
        }
    }

}
