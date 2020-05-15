package com.yiche.actionpattern.fifthObserver.javautil_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author yanglee
 * @Date 2019-08-23 23:06
 * @Description TODO 具体观察者 ---》贵重产品信息管理观察者
 * @Version 1.0
 **/
public class ValuableInfoMngObserver implements Observer, DisplayIllustrate {

    Observable observable;
    private int valuableProductNum; //库存有贵重产品
    private int normalProductNum;   //普通产品

    public ValuableInfoMngObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    /**
     * 删除当前的观察者
     */
    public void deleteObserve() {
        observable.deleteObserver(this);
    }

    @Override
    public void disPlay() {
        System.out.println("贵重物品数据改变了====>" + valuableProductNum);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof InventoryData) {
            InventoryData inventoryData = (InventoryData) o;
            this.valuableProductNum = inventoryData.getValuableProductNum();
//            this.normalProductNum = inventoryData.getNormalProductNum();
            disPlay();
        }
    }

}
