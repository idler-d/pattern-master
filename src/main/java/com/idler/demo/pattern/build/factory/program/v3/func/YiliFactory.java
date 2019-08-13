package com.idler.demo.pattern.build.factory.program.v3.func;

import com.idler.demo.pattern.build.factory.Milk;
import com.idler.demo.pattern.build.factory.Yili;

/**
 * @author idler
 * Created on 2019/8/13 0013
 */
public class YiliFactory implements Factory {
  public Milk getMilk() {
    return new Yili();
  }
}
