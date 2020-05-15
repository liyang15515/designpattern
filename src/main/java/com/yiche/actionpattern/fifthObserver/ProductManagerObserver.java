package com.yiche.actionpattern.fifthObserver;

/**
 * @Author yanglee
 * @Date 2019-08-23 22:12
 * @Description TODO 具体观察者
 * @Version 1.0
 **/
public class ProductManagerObserver implements Observer,DisplaySchedule {
    private int completeProgress;//完成进度
    private int updateProgress;//更新进度
    //将主题当成观察者的属性
    private Subject developmentProgressSubject;

    public ProductManagerObserver(Subject developmentProgressSubject) {
        this.developmentProgressSubject = developmentProgressSubject;
        //注册该观察者
        developmentProgressSubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("产品经理管理者：显示当前数据 完成进度为: " + completeProgress + "更新修改进度为:" + updateProgress);
    }

    @Override
    public void update(int completeProgress, int updateProgress) {
        this.completeProgress = completeProgress;
        this.updateProgress = updateProgress;
        display();
    }
}
