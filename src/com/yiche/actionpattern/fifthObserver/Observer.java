package com.yiche.actionpattern.fifthObserver;

/**
 * @Author yanglee
 * @Date 2019-08-23 22:04
 * @Description TODO 抽象观察者接口
 * @Version 1.0
 **/
public interface Observer {
    //更新数据
    void update(int completeProgress, int updateProgress);
}
