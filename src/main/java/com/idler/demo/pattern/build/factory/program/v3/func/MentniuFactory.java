package com.idler.demo.pattern.build.factory.program.v3.func;

import com.idler.demo.pattern.build.factory.Mengniu;
import com.idler.demo.pattern.build.factory.Milk;

/**
 * @author idler
 * Created on 2019/8/13 0013
 */
public class MentniuFactory implements Factory {
  public Milk getMilk() {
    return new Mengniu();
  }
}
