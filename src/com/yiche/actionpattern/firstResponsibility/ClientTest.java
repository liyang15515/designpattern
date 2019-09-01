package com.yiche.actionpattern.firstResponsibility;

/**
 * @Author yanglee
 * @Date 2019-08-23 15:46
 * @Description TODO 客户端测试类
 * @Version 1.0
 **/
public class ClientTest {
    public static void main(String[] args) {
        AbstractLogger logger = ChainPattern.getChainOfLoggers();
        logger.logMessage(1,"一级日志记录");
        System.out.println("--------------------------------");
        logger.logMessage(2,"二级日志记录");
        System.out.println("--------------------------------");
        logger.logMessage(3,"三级日志记录");

    }
}
