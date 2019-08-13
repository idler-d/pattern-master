package com.idler.demo.pattern.build.factory.abstr;

import com.idler.demo.pattern.build.factory.Mengniu;
import com.idler.demo.pattern.build.factory.Milk;
import com.idler.demo.pattern.build.factory.Telunsu;
import com.idler.demo.pattern.build.factory.Yili;

/**
 * @author idler
 * Created on 2019/8/13 0013
 */
public class MilkFactory extends AbstractFactory {

  @Override
  public Milk getMengniu() {
    return new Mengniu();
  }

  @Override
  public Milk getYili() {
    return new Yili();
  }

  @Override
  public Milk getTelunsu() {
    return new Telunsu();
  }
}
