package com.yiche.actionpattern.fifthObserver;

import java.util.ArrayList;

/**
 * @Author yanglee
 * @Date 2019-08-23 22:07
 * @Description TODO 具体目标类
 * @Version 1.0
 **/
public class DevelopmentProgressData implements Subject {
    private ArrayList arrayObserve;

    private int completeProgress;//完成进度
    private int updateProgress;//更新进度
    public void setCurrentData(int completeProgress,int updateProgress){
        this.completeProgress = completeProgress;
        this.updateProgress = updateProgress;
        notifyObservers();
    }
    public DevelopmentProgressData() {
        arrayObserve = new ArrayList();
    }
    @Override
    public void registerObserver(Observer observer) {
        //将观察者添加到列表中
        arrayObserve.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        int i = arrayObserve.indexOf(observer);
        if (i >= 0) {
            //将观察者从列表中解除
            arrayObserve.remove(i);
        }

    }
    //通知所以观察者数据更新了
    @Override
    public void notifyObservers() {

        for (int i = 0; i < arrayObserve.size(); i++) {
            Observer o = (Observer) arrayObserve.get(i);
            o.update(completeProgress, updateProgress);
        }
    }
}
