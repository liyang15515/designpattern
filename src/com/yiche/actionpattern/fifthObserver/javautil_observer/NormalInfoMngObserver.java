package com.yiche.actionpattern.fifthObserver.javautil_observer;



import java.util.Observable;
import java.util.Observer;

/**
 * @Author yanglee
 * @Date 2019-08-23 23:03
 * @Description TODO  具体观察者---》普通信息管理观察者
 * @Version 1.0
 **/
public class NormalInfoMngObserver  implements Observer, DisplayIllustrate {

    private Observable observable;

    private int valuableProductNum; //库存有贵重产品
    private int normalProductNum;   //普通产品

    public NormalInfoMngObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    /**
     * 删除当前的观察者
     */
    public void deleteObserver(){
        observable.deleteObserver(this);
    }

    @Override
    public void disPlay() {
        System.out.println("普通产品发生改变了:" + normalProductNum);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof InventoryData) {
            InventoryData inventoryData = (InventoryData) o;
            this.normalProductNum = inventoryData.getNormalProductNum();
            disPlay();
        }

    }
}