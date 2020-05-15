 /*
  * Copyright (c) 2013, 2019, G42&Totok and/or   its affiliates. All rights reserved.
  * TOTOK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
  */
 package com.totok.go1.factory.abstractfactory;

 /**
  * @Description
  * 抽象工厂是用户的主入口
  * 在 Spring 中应用得最为广泛的一种设计模式
  * 易于扩展,但违背了开闭原则
  **/
 public interface CourseFactory {
     INote createNote();

     IVideo createVideo();
 }
/**
 * 抽象工厂模式(Abastract Factory Pattern)是指提供一个创建一系列相关或相互依赖对象的接口，无需指定他们具体的类。
 *客户端(应用层)不依赖于产品类实例如何被创 建、实现等细节，
 * 强调的是一系列相关的产品对象(属于同一产品族)一起使用创建对 象需要大量重复的代码。
 * 需要提供一个产品类的库，所有的产品以同样的接口出现，从 而使客户端不依赖于具体实现
 */
/**
 * 以课程为例，咕泡学院第三期课程有了 新的标准，
 * 每个课程不仅要提供课程的录播视频，而且还要提供老师的课堂笔记。
 * 相当 于现在的业务变更为同一个课程不单纯是一个课程信息，要同时包含录播视频、课堂笔 记甚至还要提供源码才能构成一个完整的课程。
 * 在产品等级中增加两个产品 IVideo 录播 视频和 INote 课堂笔记。
 */