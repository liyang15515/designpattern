package com.yiche.actionpattern.fifthObserver;

/**
 * @Author yanglee
 * @Date 2019-08-23 22:15
 * @Description TODO 观察者模式测试
 * @Version 1.0
 **/
public class RunTest {
    public static void main(String[] args) {

        DevelopmentProgressData developmentProgressData = new DevelopmentProgressData();
        ProductManagerObserver productManagerObserver = new ProductManagerObserver(developmentProgressData);
        ProjectManagerObserver projectManagerObserver = new ProjectManagerObserver(developmentProgressData);
        developmentProgressData.setCurrentData(34, 45);
        //当项目经理出差了，不观察项目进度了就取消订阅了
        developmentProgressData.unRegisterObserver(projectManagerObserver);
        //当前只有产品经理获取到数据
        developmentProgressData.setCurrentData(46, 90);
    }
}
