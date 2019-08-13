package com.idler.demo.pattern.build.factory.program.v2.simple;

import com.idler.demo.pattern.build.factory.Mengniu;
import com.idler.demo.pattern.build.factory.Milk;
import com.idler.demo.pattern.build.factory.Telunsu;
import com.idler.demo.pattern.build.factory.Yili;

/**
 * 程序变化部分分离出来
 * 建立创建牛奶对象的工厂
 * @author idler
 * Created on 2019/8/13 0013
 */
public class SimpleFactoryV1 {

  public Milk getMilk(String name) {
    if ("特仑苏".equals(name)) {
      return new Telunsu();
    } else if ("伊利".equals(name)) {
      return new Yili();
    } else if ("蒙牛".equals(name)) {
      return new Mengniu();
    }
    return null;
  }
}
