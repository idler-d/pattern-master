package com.idler.demo.pattern.build.factory.func;

import com.idler.demo.pattern.build.factory.program.v3.ProgramV1;

/**
 * 工厂方法模式
 * @author idler
 * Created on 2019/8/13 0013
 */
public class FactoryTest {
  public static void main(String[] args) {
    ProgramV1 programV1 = new ProgramV1();
    System.out.println(programV1.getMilk(new MentniuFactory()));
  }
}
