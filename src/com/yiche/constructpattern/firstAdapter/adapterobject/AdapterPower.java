package com.yiche.constructpattern.firstAdapter.adapterobject;

/**
 * @Author yanglee
 * @Date 2019-08-24 02:10
 * @Description TODO 适配器：内有一个美国插头的实例对象的引用
 * @Version 1.0
 **/
public class AdapterPower implements TargetChinaPower {

    private AdapteeAmericanPower ap = new APower();

    @Override
    public void twoStep() {

        ap.threeStep();

    }

}

