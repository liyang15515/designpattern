package com.yiche.actionpattern.fifthObserver;

/**
 * @Author yanglee
 * @Date 2019-08-23 22:04
 * @Description TODO 抽象目标类
 * @Version 1.0
 **/
public interface Subject {
    //注册观察者
    void registerObserver(Observer observe);
    //解除绑定观察者
    void unRegisterObserver(Observer observe);
    //更新数据
    void notifyObservers();
}
