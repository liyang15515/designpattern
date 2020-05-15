 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.abstractfactory;

 /**
  * @Description   Python 产品族，Python 视频 PythonVideo 类:
  * @Author YangLee
  * @Date2020/5/15 5:57 上午
  * @Version
  **/
 public class PythonVideo implements IVideo {
     public void record() {
         System.out.println("录制 Python 视频");
     }
 }