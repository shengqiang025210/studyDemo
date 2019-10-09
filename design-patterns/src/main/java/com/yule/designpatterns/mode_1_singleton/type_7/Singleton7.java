package com.yule.designpatterns.mode_1_singleton.type_7;

/**
 * @ClassName: Singleton7
 * @Description: 单例模式——静态内部类
 * @Author: shengqiang
 * @Date: 2019-10-09 13:53
 * @Version: 1.0
 **/
public class Singleton7 {

  private Singleton7() {
  }

  private static class Innclass{
    private static final Singleton7 instance = new Singleton7();
  }

  public static Singleton7 getInstance(){
    return Innclass.instance;
  }
}
