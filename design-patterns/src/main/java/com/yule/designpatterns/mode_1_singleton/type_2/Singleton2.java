package com.yule.designpatterns.mode_1_singleton.type_2;

/**
 * @ClassName: Singleton2
 * @Description:单例模式——饿汉式静态代码块
 * @Author: shengqiang
 * @Date: 2019-10-09 11:41
 * @Version: 1.0
 **/
public class Singleton2 {
  private static final Singleton2 singleton ;
  static {
    singleton = new Singleton2();
  }

  //构造函数私有化，防止通过构造函数随意创建对象
  private Singleton2() {
  }

  //提供公共获取实例方法
  public static Singleton2 getInstance(){
    return singleton;
  }
}
