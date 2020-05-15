 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.abstractfactory;

 /**
  * @Description
  * @Author YangLee
  * @Date2020/5/15 6:00 上午
  * @Version
  **/
 public class PythonCourseFactory implements CourseFactory {
     public INote createNote() {
         return new PythonNote();
     }

     public IVideo createVideo() {
         return new PythonVideo();
     }
 }
