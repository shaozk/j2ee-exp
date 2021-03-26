/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package spring.proxyfactorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;

/**
 * @author shaozk
 * @Description: TODO
 */
public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check();
        except();
        Object object = methodInvocation.proceed();
        log();
        monitor();
        return object;
    }

    public void check() {
        System.out.println("模拟权限控制");
    }

    public void except() {
        System.out.println("模拟异常处理");
    }

    public void monitor() {
        System.out.println("性能检测");
    }

    public void log() {
        System.out.println("模拟日志打印");
    }

}
