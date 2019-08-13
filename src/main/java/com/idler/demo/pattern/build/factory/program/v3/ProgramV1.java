package com.idler.demo.pattern.build.factory.program.v3;

import com.idler.demo.pattern.build.factory.Mengniu;
import com.idler.demo.pattern.build.factory.Milk;
import com.idler.demo.pattern.build.factory.Telunsu;
import com.idler.demo.pattern.build.factory.Yili;
import com.idler.demo.pattern.build.factory.func.Factory;

/**
 * 牛奶获取程序
 * @author idler
 * Created on 2019/8/13 0013
 */
public class ProgramV1 {

  public Milk getMilk(Factory factory) {
    if (factory == null) return null;

    return factory.getMilk();
  }
}
