package aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	//定义切入点
	@Pointcut("execution(* dao.*.*(..))")
	private void myPointCut() {

	}

	@Before("myPointCut()")
	public Object before(JoinPoint pjp) throws Throwable {
		System.out.println("====基于注解的声明式AspectJ的前置通知====");

		//获取当前请求方法的参数值
		Object[] args = pjp.getArgs();

		if(args[0].toString().equals("agree")) {
			System.out.println("请求成功！");


		}else {
			System.out.println("请求失败，拒绝访问！");
//			由于前置通知是切入在方法执行前，所以为了防止他执行visitdao，此处抛出一个异常
//			System.exit(-1);
			if(true) {
				throw new Exception("非法访问");

			}

		}
		return null;


	}
}

