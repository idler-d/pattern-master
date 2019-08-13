package com.idler.demo.pattern.build.factory.program.v1;

import com.idler.demo.pattern.build.factory.Mengniu;
import com.idler.demo.pattern.build.factory.Milk;
import com.idler.demo.pattern.build.factory.Telunsu;
import com.idler.demo.pattern.build.factory.Yili;

/**
 * 牛奶获取程序
 * @author idler
 * Created on 2019/8/13 0013
 */
public class ProgramV1 {
  public static Milk getMilk(String name) {
    if ("伊利".equals(name)) {
      return new Yili();
    } else if ("特仑苏".equals(name)) {
      return new Telunsu();
    } else if ("蒙牛".equals(name)) {
      return new Mengniu();
    }
    return null;
  }
}
