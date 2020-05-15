 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory;

 /**
  * @Description
  * @Author YangLee
  * @Date2020/5/15 4:53 上午
  * @Version
  **/
 public class JavaCourse implements ICourse {
     @Override
     public void record() {
         System.out.println("录制 Java 课程");
     }
 }
