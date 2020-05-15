package com.yiche.actionpattern.fifthObserver.javautil_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author yanglee
 * @Date 2019-08-23 22:59
 * @Description TODO 具体观察者--》总经理老板
 * @Version 1.0
 **/
public class BossMngObserver  implements Observer, DisplayIllustrate {

    private Observable observable;
    private int valuableProductNum; //库存有贵重产品
    private int normalProductNum;   //普通产品

    public BossMngObserver(Observable observable) {
        this.observable = observable;
        //添加绑定当前的观察者
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

        System.out.println("总经理观察数据改变:贵重产品数量: " + valuableProductNum + "普通产品数量： " + normalProductNum);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof InventoryData) {
            InventoryData inventoryData = (InventoryData) o;
            this.valuableProductNum = inventoryData.getValuableProductNum();
            this.normalProductNum = inventoryData.getNormalProductNum();
            disPlay();
        }
    }
}