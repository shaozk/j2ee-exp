package aspect.annotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
class MyAspect {
    //定义切入点表达式
    @Pointcut("execution(* dao.*.*(..))")
    private void myPointCut() {
            //使用一个返回值为void,方法体为空的方法来命名切入点
            }

    @Before("myPointCut()")
    // 前置通知
    public void myBefore(JoinPoint joinPoint) {
            System.out.print("前置通知:模拟执行权限....");
            System.out.print("目标类是:" + joinPoint.getTarget());
            System.out.print(",被织入增强处理的目标方法为:" + joinPoint.getSignature().getName());
            System.out.println();
            }

        @AfterReturning(value ="myPointCut()")
        // 后置通知
        public void myAfterReturning(JoinPoint joinPoint) {
            System.out.print("后置通知:模拟记录日志....");
            System.out.print(",被织入增强处理的目标方法为:" + joinPoint.getSignature().getName());
            System.out.println();
        }

        // 环绕通知
        /**
         *
         * ProceedingJoinPoint 是JoinPoint子接口，表示可以执行目标方法 1.必须是Object类型的返回值
         * 2.必须接收一个参数，类型为ProceedingJoinPoint 3.必须throws Throwable
         */
        @Around("myPointCut()")
        public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
            // 开始
            System.out.println("环绕开始:执行目标方法执行之前，模拟开启事务...");
            // 执行当前目标方法
            Object obj = proceedingJoinPoint.proceed();

            // 结束
            System.out.println("环绕结束：执行目标方法之后，模拟关闭事务");
            return obj;

        }

        @AfterThrowing(value = "myPointCut()",throwing="e")
        // 异常通知
        public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
            System.out.println("异常通知" + "出错了" + e.getMessage());
        }

        // 最终通知
        @After(value = "myPointCut()")
        public void myAfter() {
            System.out.println("最终通知:模拟方法结束后释放资源...");
        }
}
