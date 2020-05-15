package com.yiche.constructpattern.firstAdapter.adapterclass;

/**
 * @Author yanglee
 * @Date 2019-08-24 02:05
 * @Description TODO 类适配器模式的测试
 * @Version 1.0
 **/
public class ClassTest {
    public static void main(String[] args) {
        TargetChinaPower chinaPower = new AdapterPower();
        //插入两脚的电源线，可以适配三角的插头。
        chinaPower.twoStep();
    }
}
