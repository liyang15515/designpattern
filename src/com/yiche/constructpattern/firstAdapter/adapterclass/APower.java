package com.yiche.constructpattern.firstAdapter.adapterclass;

/**
 * @Author yanglee
 * @Date 2019-08-24 01:55
 * @Description TODO (具体适配者：需要适配的具体实现类) 美国电源插头的具体实现类
 * @Version 1.0
 **/
public class APower implements AdapteeAmericanPower {
    @Override
    public void threeStep() {
        System.out.println("我是三角的电源");
    }
}
