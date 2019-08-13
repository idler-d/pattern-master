package com.idler.demo.pattern.build.factory.program.v2;

import com.idler.demo.pattern.build.factory.program.v2.ProgramV1;

/**
 * 简单工厂模式
 * @author idler
 * Created on 2019/8/13 0013
 */
public class SimpleFactoryTest {
  public static void main(String[] args) {
    ProgramV1 programV1 = new ProgramV1();

    System.out.println(programV1.getMilk("特仑苏"));
  }
}
