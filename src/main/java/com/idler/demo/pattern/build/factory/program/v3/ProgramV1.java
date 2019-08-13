package com.idler.demo.pattern.build.factory.program.v3;

import com.idler.demo.pattern.build.factory.Milk;
import com.idler.demo.pattern.build.factory.program.v3.func.Factory;

/**
 * 牛奶获取程序
 *
 * 在简单工厂模式中，把创建变化部分从程序中分离，
 * 使得程序本身不需要做修改，把修改的部分集中处理。
 *
 * 但是在添加时还是需要做代码的修改。
 *
 * 然后就出现了工厂方法模式，把每一种牛奶的创建工厂抽离，
 * 从而把变化部分独立化。
 *
 * 在有需求添加燕塘牛奶时，只需要创建燕塘牛奶的工厂类就可以了。
 *
 * 但是引出了2个问题：
 * 1、类的增加，从内存性能来说。类的加载会增加内存的消耗。有人还会说会增加维护的困难，
 *    不过我觉得其实如果整理得当。其实还是比较清晰的。而且每个类都非常简单。
 *
 * 2、创建factory的问题， 程序可以看到创建实际factory是在main方法中。
 *    就说明工厂的创建就对用户透明了，透露了不必要的信息给用户。
 *    会导致对用户的复杂度增加。
 * @author idler
 * Created on 2019/8/13 0013
 */
public class ProgramV1 {
  private Factory factory;

  public void setFactory(Factory factory) {
    this.factory = factory;
  }

  public Milk getMilk() {
    if (factory == null) return null;

    return factory.getMilk();
  }
}
