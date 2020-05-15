 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory;

 import com.totok.go1.factory.simplefactory.CourseFactory;

 /**
  * @Description 简单工厂模式客户端调用代码:
  * @Author YangLee
  * @Date2020/5/15 5:01 上午
  * @Version
  **/
 public class SimpleFactoryTest {
     public static void main(String[] args) {
         CourseFactory factory = new CourseFactory();
         ICourse iCourse = factory.create("java");
         System.out.println("简单工厂客户端调用---》初始简单版");
         iCourse.record();
     }
 }
 /**
  * 简单工厂模式客户端调用代码:
  * 客户端调用是简单了，但如果我们业务继续扩展，要增加前端课程，
  * 那么工厂中的 create() 就要根据产品链的丰富每次都要修改代码逻辑。不符合开闭原则。
  * 因此，我们对简单工 厂还可以继续优化，可以采用反射技术:
  */