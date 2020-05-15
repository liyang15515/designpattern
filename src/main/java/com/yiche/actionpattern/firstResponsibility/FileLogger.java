package com.yiche.actionpattern.firstResponsibility;

/**
 * @Author yanglee
 * @Date 2019-08-23 15:41
 * @Description TODO 文件处理器
 * @Version 1.0
 **/
public class FileLogger extends  AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File Console::Logger"+message);
    }
}
