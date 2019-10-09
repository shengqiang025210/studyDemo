package com.yule.designpatterns.mode_1_singleton.type_1;

/**
 * @ClassName: Singleton1
 * @Description: 单例模式——饿汉式静态常量
 * @Author: shengqiang
 * @Date: 2019-10-09 11:15
 * @Version: 1.0
 **/
public class Singleton1 {

  //构造函数私有化，防止通过构造函数随意创建对象
  private Singleton1() {
  }

  //提供公共获取实例方法
  public static Singleton1 getInstance(){
    return singleton;
  }

  private static final Singleton1 singleton = new Singleton1();

}
