 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.factorymethod;

 import com.totok.go1.factory.ICourse;

 /**
  * @Description 工厂方法模式--》模拟客户端调用测试
  * @Author YangLee
  * @Date2020/5/15 5:28 上午
  * @Version
  **/
 public class ICourseFactoryTest {
     public static void main(String[] args) {

         ICourseFactory factory = new PythonCourseFactory();
         ICourse course = factory.create();
         course.record();

         factory = new JavaCourseFactory();
         course = factory.create();
         course.record();
     }
 }
 /**
  * 工厂方法适用于以下场景:
  * 1、创建对象需要大量重复的代码。
  * 2、客户端(应用层)不依赖于产品类实例如何被创建、实现等细节。
  * 3、一个类通过其子类来指定创建哪个对象。
  *
  * 工厂方法也有缺点:
  * 1、类的个数容易过多，增加复杂度。
  * 2、增加了系统的抽象性和理解难度。
  */
