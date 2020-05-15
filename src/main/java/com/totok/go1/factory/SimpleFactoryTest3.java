 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory;

 import com.totok.go1.factory.simplefactory.CourseFactory3;

 /**
  * @Description
  * @Author YangLee
  * @Date2020/5/15 5:16 上午
  * @Version
  **/
 public class SimpleFactoryTest3 {
     public static void main(String[] args) {
         CourseFactory3 factory = new CourseFactory3();
         ICourse course = factory.create(JavaCourse.class);
         System.out.println("简单工厂客户端调用---》改造版终极形式");
         course.record();
     }
 }
 /**
  * 简单工厂模式在 JDK 源码也是无处不在，现在我们来举个例子，例如 Calendar 类，
  * 看 Calendar.getInstance()方法，下面打开的是 Calendar 的具体创建类:createCalendar()
  *
  * 还有一个大家经常使用的 logback，我们可以看到 LoggerFactory 中有多个重载的方法 getLogger():
  *
  * 简单工厂也有它的缺点:工厂类的职责相对过重，不易于扩展过于复杂的产品结构。
  */
