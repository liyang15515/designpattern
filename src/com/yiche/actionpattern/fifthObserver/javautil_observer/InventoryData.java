package com.yiche.actionpattern.fifthObserver.javautil_observer;

import com.yiche.actionpattern.fifthObserver.Observer;

import java.util.Observable;

/**
 * @Author yanglee
 * @Date 2019-08-23 22:52
 * @Description TODO 具体目标类---》库存数据信息
 * @Version 1.0
 **/
public class InventoryData extends Observable {
    private int valuableProductNum; //库存有贵重产品
    private int normalProductNum;   //普通产品

    public void setCurrentData(int valuableProductNum, int normalProductNum) {
        this.valuableProductNum = valuableProductNum;
        this.normalProductNum = normalProductNum;
        statusChange();
    }

    private void statusChange() {
        setChanged();
        notifyObservers();
    }

    public int getValuableProductNum() {
        return valuableProductNum;
    }

    public void setValuableProductNum(int valuableProductNum) {
        this.valuableProductNum = valuableProductNum;
    }

    public int getNormalProductNum() {
        return normalProductNum;
    }

    public void setNormalProductNum(int normalProductNum) {
        this.normalProductNum = normalProductNum;
    }
}
