package com.idler.demo.pattern.build.factory.program.v3.func;

import com.idler.demo.pattern.build.factory.Milk;
import com.idler.demo.pattern.build.factory.Yantang;

/**
 * 新增加的燕塘牛奶工厂
 * @author idler
 * Created on 2019/8/13 0013
 */
public class YanTangFactory implements Factory {

  @Override
  public Milk getMilk() {
    return new Yantang();
  }
}
