package com.idler.demo.pattern.build.factory.program.v3.func;

import com.idler.demo.pattern.build.factory.Milk;
import com.idler.demo.pattern.build.factory.Telunsu;

/**
 * @author idler
 * Created on 2019/8/13 0013
 */
public class TelunsuFactory implements Factory {
  public Milk getMilk() {
    return new Telunsu();
  }
}
