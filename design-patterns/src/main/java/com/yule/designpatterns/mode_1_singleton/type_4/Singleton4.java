package com.yule.designpatterns.mode_1_singleton.type_4;

/**
 * @ClassName: Singleton4
 * @Description: 单例模式——线程安全，同步方法
 * @Author: shengqiang
 * @Date: 2019-10-09 13:13
 * @Version: 1.0
 **/
public class Singleton4 {
  private static Singleton4 instance;

  private Singleton4() {
  }

  public static synchronized Singleton4 getInstance(){
    if (instance == null ){
      instance = new Singleton4();
    }
    return instance;
  }
}
