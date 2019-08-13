package com.idler.demo.pattern.build.factory.program.v3;

import com.idler.demo.pattern.build.factory.program.v3.func.MentniuFactory;

/**
 * 工厂方法模式
 * @author idler
 * Created on 2019/8/13 0013
 */
public class FactoryTest {
  public static void main(String[] args) {
    ProgramV1 programV1 = new ProgramV1();
    programV1.setFactory(new MentniuFactory());
    System.out.println(programV1.getMilk());
  }
}
