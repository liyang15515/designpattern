 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.simplefactory;

 import com.totok.go1.factory.ICourse;

 /**
  * @Description 简单工厂模式
  * @Author YangLee
  * @Date2020/5/15 5:07 上午
  * @Version
  **/
 public class CourseFactory2 {
     public ICourse create(String className) {
         try {
             if (!(null == className || "".equals(className))) {
                 return (ICourse) Class.forName(className).newInstance();
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return null;
     }
 }
