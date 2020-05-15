package com.yiche.actionpattern.firstResponsibility;

/**
 * @Author yanglee
 * @Date 2019-08-23 15:40
 * @Description TODO 控制台处理器
 * @Version 1.0
 **/
public class ConsoleLogger extends  AbstractLogger{
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger :"+message);
    }
}
