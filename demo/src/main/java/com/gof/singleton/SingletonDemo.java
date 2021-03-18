/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package com.gof.singleton;

// 饿汉模式
class SingletonDemo1 {

    // 初始即加载（没有延时加载的优势）
    // 线程安全
    private static SingletonDemo1 instance = new SingletonDemo1();

    // 构造器私有化, 外部不能访问
    private SingletonDemo1() {

    }
    // 没有异步，效率高
    public static SingletonDemo1 getInstance() {
        return instance;
    }


}

// 懒汉模式
class SingletonDemo2 {
    // 只声明不初始化
    private static SingletonDemo2 instance;
    // 私有化构造器
    private SingletonDemo2() {

    }

    // 方法同步，调用效率低下
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
