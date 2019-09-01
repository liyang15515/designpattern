package com.yiche.constructpattern.firstAdapter.adapterclass;

/**
 * @Author yanglee
 * @Date 2019-08-24 02:02
 * @Description TODO 适配器：同时也是TargetChinaPower抽象目标类的具体实现类
 * @Version 1.0
 **/
public class AdapterPower extends APower implements TargetChinaPower {
    @Override
    public void twoStep() {
        this.threeStep();
    }
}
