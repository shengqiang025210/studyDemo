package com.yule.designpatterns.mode_1_singleton.type_3;

/**
 * @ClassName: Singleton3
 * @Description: 懒汉式——线程不安全
 * @Author: shengqiang
 * @Date: 2019-10-09 13:09
 * @Version: 1.0
 **/
public class Singleton3 {
  private static Singleton3 singleton;

  private Singleton3() {
  }

  public static Singleton3 getInstance(){
    if (singleton == null ){
      singleton = new Singleton3();
    }
    return singleton;
  }
}
