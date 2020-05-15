 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.abstractfactory;

 /**
  * @Description Java 产品族的具体工厂 JavaCourseFactory:
  * @Author YangLee
  * @Date2020/5/15 5:56 上午
  * @Version
  **/
 public class JavaCourseFactory implements CourseFactory {
     @Override
     public INote createNote() {
         return new JavaNote();
     }

     @Override
     public IVideo createVideo() {
         return new JavaVideo();
     }
 }
