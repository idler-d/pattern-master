package com.idler.demo.pattern.build.factory.program.v1;

import com.idler.demo.pattern.build.factory.*;

/**
 * 牛奶获取程序 V2
 * 需求添加燕塘牛奶
 * @author idler
 * Created on 2019/8/13 0013
 */
public class ProgramV2 {
  public static Milk getMilk(String name) {
    if ("伊利".equals(name)) {
      return new Yili();
    } else if ("特仑苏".equals(name)) {
      return new Telunsu();
    } else if ("蒙牛".equals(name)) {
      return new Mengniu();
    } else if ("燕塘".equals(name)) {
      return new Yantang();
    }
    return null;
  }
}
