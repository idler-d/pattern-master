package com.idler.demo.pattern.build.factory.abstr;

import com.idler.demo.pattern.build.factory.Milk;

/**
 * @author idler
 * Created on 2019/8/13 0013
 */
public abstract class AbstractFactory {
  public abstract Milk getMengniu();

  public abstract Milk getYili();

  public abstract Milk getTelunsu();
}
