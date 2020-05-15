 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.factorymethod;

 import com.totok.go1.factory.ICourse;
 import com.totok.go1.factory.JavaCourse;

 /**
  * @Description  工厂方法模式--》Java课程工厂
  * @Author YangLee
  * @Date2020/5/15 5:25 上午
  * @Version
  **/
 public class JavaCourseFactory implements ICourseFactory {
     @Override
     public ICourse create() {
      System.out.println("Java课程工厂   创建对象");
         return new JavaCourse();
     }
 }
