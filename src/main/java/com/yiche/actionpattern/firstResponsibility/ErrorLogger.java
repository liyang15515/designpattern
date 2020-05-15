package com.yiche.actionpattern.firstResponsibility;

/**
 * @Author yanglee
 * @Date 2019-08-23 15:43
 * @Description TODO error日志处理器
 * @Version 1.0
 **/
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
