package com.yiche.actionpattern.firstResponsibility;

/**
 * @Author yanglee
 * @Date 2019-08-23 15:45
 * @Description TODO 处理器链
 * @Version 1.0
 **/
public class ChainPattern {
    public static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return  errorLogger;
    }
}
