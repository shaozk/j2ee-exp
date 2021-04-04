package aspect.annotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import static java.lang.System.exit;

@Aspect
@Component
class MyAspect {
    //定义切入点表达式
    @Pointcut("execution(* com.dao.AnnTestDaoImpl.*(..))")
    private void myPointCut() {
        //使用一个返回值为void,方法体为空的方法来命名切入点
    }

    @Before("myPointCut()")
    // 前置通知
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("基于注解的声明式AspectJ");

        //获取当前请求方法的参数值
        Object[] args = joinPoint.getArgs();

        if(args[0].toString().equals("agree")) {
            System.out.println("请求成功！");
        }else {
            System.out.println("请求失败，拒绝访问！");
            exit(-1);
        }
    }

}
