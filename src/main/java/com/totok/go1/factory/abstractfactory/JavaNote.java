 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.abstractfactory;

 /**
  * @Description  扩展产品等级 Java 课堂笔记 JavaNote 类:
  * @Author YangLee
  * @Date2020/5/15 5:48 上午
  * @Version
  **/
 public class JavaNote implements INote {
     @Override
     public void edit() {
         System.out.println("编写 Java 笔记");
     }
 }
