package com.yule.designpatterns.mode_1_singleton.type_6;

/**
 * @ClassName: Singleton5
 * @Description: 单例模式——双重检查
 * @Author: shengqiang
 * @Date: 2019-10-09 13:29
 * @Version: 1.0
 **/
public class Singleton6 {

  private static volatile Singleton6 instance;

  private Singleton6() {
  }

  public static Singleton6 getInstance(){
    if (instance == null){
      synchronized (Singleton6.class){
        if (instance == null){
          instance = new Singleton6();
        }
      }
    }
    return instance;
  }
}
