/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package com.gof.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shaozk
 * @Description: 代理模式示例
 */
interface Star {
    void signContract();
    void sing();
    void collectMoney();
}

class RealStar implements Star {

    @Override
    public void signContract() {
        System.out.println("（明星本人）签字");
    }

    @Override
    public void sing() {
        System.out.println("（明星本人）唱歌");

    }

    @Override
    public void collectMoney() {
        System.out.println("（明星本人）收钱");
    }
}

class StarHandler implements InvocationHandler {

    Star realStar;
    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        System.out.println("真正的方法执行前！");
        //只有唱歌处理，其他方法不做处理
        if(method.getName().equals("sing")){
            object = method.invoke(realStar, args);
        }else{
            System.out.println("代理处理："+method.getName());
        }
        System.out.println("真正的方法执行后！");
        return object;
    }
}

class Client {
    public static void main(String[] args) {
        //将明星注册到处理核心类里面
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);
        //动态创造代理类和代理对象
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class}, handler);
        //生成的代理对象的任何方法里面都是调用了：handler.invoke()方法
        proxy.sing();
        System.out.println("###################################");
        proxy.collectMoney();
    }
}

