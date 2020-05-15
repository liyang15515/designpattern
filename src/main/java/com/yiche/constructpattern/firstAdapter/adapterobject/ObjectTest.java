package com.yiche.constructpattern.firstAdapter.adapterobject;

/**
 * @Author yanglee
 * @Date 2019-08-24 02:13
 * @Description TODO  对象适配器的测试
 * @Version 1.0
 **/
public class ObjectTest {
    public static void main(String[] args) {
        TargetChinaPower chinaPower = new AdapterPower();
        //插入两脚的电源线，可以适配三角的插头。
        chinaPower.twoStep();
    }
}
