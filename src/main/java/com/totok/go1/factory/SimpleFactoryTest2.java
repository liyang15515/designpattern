 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory;

 import com.totok.go1.factory.simplefactory.CourseFactory2;

 /**
  * @Description 简单工厂客户端
  * @Author YangLee
  * @Date2020/5/15 5:09 上午
  * @Version
  **/
 public class SimpleFactoryTest2 {
     public static void main(String[] args) {
         CourseFactory2 factory = new CourseFactory2();
         System.out.println("简单工厂客户端调用---》升级改造版");
         ICourse course = factory.create("com.totok.go1.factory.PythonCourse");
         course.record();
     }
 }
 /**
  * 优化之后，产品不断丰富不需要修改 CourseFactory 中的代码。
  * 但是，有个问题是，方 法参数是字符串，可控性有待提升，而且还需要强制转型。
  * 我们再修改一下代码:
  */
