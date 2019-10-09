package com.yule.designpatterns.mode_1_singleton.type_5;

/**
 * @ClassName: Singleton5
 * @Description: 单例模式——线程安全，同步代码块
 * @Author: shengqiang
 * @Date: 2019-10-09 13:29
 * @Version: 1.0
 **/
public class Singleton5 {
  private static Singleton5 instance;

  private Singleton5() {
  }

  public static Singleton5 getInstance(){
    if (instance == null){
      synchronized (Singleton5.class){
        instance = new Singleton5();
      }
    }
    return instance;
  }
}
