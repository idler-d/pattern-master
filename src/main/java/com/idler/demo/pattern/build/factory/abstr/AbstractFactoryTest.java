package com.idler.demo.pattern.build.factory.abstr;

/**
 * 抽象工厂方法模式
 * @author idler
 * Created on 2019/8/13 0013
 */
public class AbstractFactoryTest {

  public static void main(String[] args) {
    AbstractFactory factory = new MilkFactory();

    factory.getMengniu();
  }
}
