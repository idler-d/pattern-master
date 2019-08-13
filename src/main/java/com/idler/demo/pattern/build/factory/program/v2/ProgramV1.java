package com.idler.demo.pattern.build.factory.program.v2;

import com.idler.demo.pattern.build.factory.Milk;
import com.idler.demo.pattern.build.factory.program.v2.simple.SimpleFactory;

/**
 * 牛奶获取程序
 *
 * 把创建变化部分分离出来后
 * 在新增牛奶时可以看到程序本身并没有变化
 * 相对的改变的是简单工程的类
 *
 * @author idler
 * Created on 2019/8/13 0013
 */
public class ProgramV1 {
  public static Milk getMilk(String name) {
    SimpleFactory simpleFactory = new SimpleFactory();
    return simpleFactory.getMilk(name);
  }
}
