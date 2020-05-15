 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.factorymethod;

 import com.totok.go1.factory.ICourse;

 /**
  * @Description  工厂方法模式
  * 工厂方法模式(Fatory Method Pattern)是指定义一个创建对象的接口，
  * 但让实现这个 接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行。
  *
  * 在工厂方法 模式中用户只需要关心所需产品对应的工厂，无须关心创建细节，而且加入新的产品符 合开闭原则。
  * 工厂方法模式主要解决产品扩展的问题，
  * 在简单工厂中，随着产品链的丰富，如果每个 课程的创建逻辑有区别的话，工厂的职责会变得越来越多，有点像万能工厂，并不便于 维护。
  * 根据单一职责原则我们将职能继续拆分，专人干专事。
  * Java 课程由 Java 工厂创建， Python 课程由 Python 工厂创建，对工厂本身也做一个抽象
  * @Author YangLee
  * @Date2020/5/15 5:25 上午
  * @Version
  **/
 public interface ICourseFactory {
     ICourse create();
 }
