 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory;

 /**
  * @Description 客户端调用代码
  * @Author YangLee
  * @Date2020/5/15 4:56 上午
  * @Version
  **/
 public class ICourseTest {
     public static void main(String[] args) {
         ICourse course = new JavaCourse();
         course.record();
     }
     /**
      *  客户端调用代码:
      *  看上面的代码，父类 ICourse 指向子类 JavaCourse 的引用，应用层代码需要依赖 JavaCourse，
      *  如果业务扩展，我继续增加 PythonCourse 甚至更多，那么我们客户端的 依赖会变得越来越臃肿。
      *  因此，我们要想办法把这种依赖减弱，把创建细节隐藏。
      *  虽然 目前的代码中，我们创建对象的过程并不复杂，但从代码设计角度来讲不易于扩展。
      *  现 在，我们用简单工厂模式对代码进行优化
      */
 }
