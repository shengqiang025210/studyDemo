package com.yule.designpatterns.mode_1_singleton.type_1;

/**
 * @ClassName: MainTest
 * @Description: 测试类
 * @Author: shengqiang
 * @Date: 2019-10-09 11:34
 * @Version: 1.0
 **/
public class MainTest {
  public static void main(String[] args) {
    Singleton1 instance1 = Singleton1.getInstance();
    Singleton1 instance2 = Singleton1.getInstance();
    System.out.println("instance1.equal(instance2):"+instance1.equals(instance2));
    System.out.println("instance1==instance2:"+(instance1==instance2));
    System.out.println("instance1.hashcode():"+instance1.hashCode());
    System.out.println("instance2.hashcode():"+instance2.hashCode());
  }
}
