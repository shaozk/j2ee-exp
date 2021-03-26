/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package dynamic.cglib;

import aspect.MyAspect;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author shaozk
 * @Description: TODO
 */
public class CglibDynamicProxy implements MethodInterceptor {

    /**
     * 创建代理的方法，生成CGLIB代理对象，
     * target是目标对象，需要增强的对象
     * 返回目标对象的CGLIB代理对象
     * @param target
     * @return
     */
    public Object createProxy(Object target) {
        // 创建一个动态类对象，即增强类对象
        Enhancer enhancer = new Enhancer();

        // 确定需要增强的类，设置其父类
        enhancer.setSuperclass(target.getClass());

        // 确定代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor的方法
        enhancer.setCallback((Callback) this);

        // 返回创建的代理对象
        return enhancer.create();

    }

    /**
     * intercept方法会在程序执行目标方法时被调用
     * proxy是CGLIB根据指定父类生成的代理对象
     * method是拦截方法
     * args是拦截方法的参数数组
     * methodProxy是方法的dialing对象，用于执行父类的方法
     * 返回代理结果
     * @param
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 创建一个切面
        MyAspect myAspect = new MyAspect();
        // 前增强
        myAspect.check();
        myAspect.except();

        // 目标方法执行，返回代理结果
        Object obj = methodProxy.invokeSuper(o, objects);

        // 后增强
        myAspect.log();
        myAspect.monitor();
        return obj;
    }



}
