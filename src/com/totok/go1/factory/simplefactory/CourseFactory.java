 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.simplefactory;

 import com.totok.go1.factory.ICourse;
 import com.totok.go1.factory.JavaCourse;
 import com.totok.go1.factory.PythonCourse;

 /**
  * @Description  简单工厂模式
  * @Author YangLee
  * @Date2020/5/15 5:00 上午
  * @Version
  **/
 public class CourseFactory {
     public ICourse create(String name) {
         if ("java".equals(name)) {
             return new JavaCourse();
         } else if ("python".equals(name)) {
             return new PythonCourse();
         } else {
             return null;
         }
     }
 }
