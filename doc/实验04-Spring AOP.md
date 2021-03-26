# 实验04 Spring AOP

## 代码
**pom.xml**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>ch4</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>


    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context-support</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-expression</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/commons-logging/commons-logging -->
        <dependency>
            <groupId>commons-logging</groupId>
            <artifactId>commons-logging</artifactId>
            <version>1.2</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.8.13</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.springframework/spring-aop -->
<!--        注意保持版本一致-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/aopalliance/aopalliance -->
<!--        <dependency>-->
<!--            <groupId>aopalliance</groupId>-->
<!--            <artifactId>aopalliance</artifactId>-->
<!--            <version>1.0</version>-->
<!--        </dependency>-->

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aspects</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-test</artifactId>
            <version>4.2.2.RELEASE</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>compile</scope>
        </dependency>


    </dependencies>

</project>

```

**dao.TestDao**
```java
/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package dao;

/**
 * @author shaozk
 * @Description: TODO
 */
public interface TestDao {
    public void save();
    public void modify();
    public void delete();
}


```
**dao.TestDaoImpl**
```java
/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package dao;

import org.springframework.stereotype.Repository;

/**
 * @author shaozk
 * @Description: TODO
 */
@Repository("testDaoImpl")
public class TestDaoImpl implements TestDao {

    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void modify() {
        System.out.println("修改");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }
}

```

**aspect.xml.MyAspect**
```java
/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package aspect.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author shaozk
 * @Description: 切面类
 */
public class MyAspect {
    // 前置通知
    public void myBefore(JoinPoint joinPoint) {
        System.out.print("前置通知:模拟执行权限....");
        System.out.print("目标类是:" + joinPoint.getTarget());
        System.out.print(",被织入增强处理的目标方法为:" + joinPoint.getSignature().getName());
        System.out.println();
    }

    // 后置通知
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.print("后置通知:模拟记录日志....");
        System.out.print(",被织入增强处理的目标方法为:" + joinPoint.getSignature().getName());
        System.out.println();
    }
    // 环绕通知
    /**
     * ProceedingJoinPoint 是JoinPoint子接口，表示可以执行目标方法 1.必须是Object类型的返回值
     * 2.必须接收一个参数，类型为ProceedingJoinPoint 3.必须throws Throwable
     */
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 开始
        System.out.println("环绕开始:执行目标方法执行之前，模拟开启事务...");
        // 执行当前目标方法
        Object obj = proceedingJoinPoint.proceed();

        // 结束
        System.out.println("环绕结束：执行目标方法之后，模拟关闭事务");
        return obj;

    }
    // 异常通知
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常通知" + "出错了" + e.getMessage());
    }
    // 最终通知
    public void myAfter() {
        System.out.println("最终通知:模拟方法结束后释放资源...");
    }

}

```

**aspect.xml.XMLAspectJTest**
```java
/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package aspect.xml;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: TODO
 */
public class XMLAspectJTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlAspectContext.xml");
        TestDao advice = (TestDao) applicationContext.getBean("testDao");
        // 执行方法
        advice.save();
    }
}


```

**xmlAspectContext.xml**
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/aop
       https://www.springframework.org/schema/aop/spring-aop.xsd">
    <!--spring-beans-4.3这里的4.3是指明版本号 -->
    <!-- 1.目标类 -->
    <bean id="testDao" class="dynamic.jdk.TestDaoImpl"/>
    <!-- 2.切面 -->
    <bean id="myAspect" class="aspect.xml.MyAspect"/>
    <!-- 3.Aop编程 -->
    <aop:config>
        <!-- 配置切面 -->
        <aop:aspect ref="myAspect">
            <!-- 3.1配置切入点，通知最后增强那些方法 ,对所有的类，里面所有的方法进行增强 -->
            <aop:pointcut
                    expression="execution(* dynamic.jdk.*.*(..))" id="myPointCut" />
            <!-- 3.2管理通知Advice和切入点 -->
            <!-- 3.2.1前置通知 -->
            <aop:before method="myBefore" pointcut-ref="myPointCut" />
            <!-- 3.2.1后置通知,在方法返回之后执行，就可以获得返回值 returning属性：用于设置后置通知的第二个参数名称，类型是Object -->
            <aop:after-returning method="myAfterReturning" pointcut-ref="myPointCut" />
            <!-- 3.2.3环绕通知 -->
            <aop:around method="myAround" pointcut-ref="myPointCut" />
            <!-- 3.2.4抛出通知：用于处理程序发生的异常 -->
            <!-- 如果程序没有异常，将不会执行增强 -->
            <!-- throwing 属性：用于设置通知第二个参数的名称，类型为Throwable -->
            <aop:after-throwing method="myAfterThrowing" pointcut-ref="myPointCut" throwing="e" />
            <!-- 3.2.5最终通知：无论程序发生任何事情，都将执行 -->
            <aop:after method="myAfter" pointcut-ref="myPointCut" />
        </aop:aspect>
    </aop:config>
</beans>
```

**aspect.annotation.Aspect**
```java
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

```

**aspect.annotation.Test**
```java
/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package aspect.annotation;


import dao.TestDao;
import dao.TestDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationAspectContext.xml");
        TestDao dao = (TestDao) applicationContext.getBean("testDaoImpl");
        dao.delete();
    }
}


```

**annotationAspectContext.xml**
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
        http://www.springframework.org/schema/aop/spring-aop.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">

    <!--指定需要扫描的包，使注解生效  -->
    <context:component-scan base-package="aspect.annotation"/>
    <context:component-scan base-package="dao"/>


    <!-- 启动基于注解的AspectJ支持 -->
    <aop:aspectj-autoproxy/>

</beans>

```


## 实验截图
* 基于XML的声明式AspectJ
  ![实验04-基于XML的声明式AspectJ](../images/实验04-基于XML的声明式AspectJ.png)
  
* 基于注解的声明式AspectJ
  ![实验04-基于注解的声明式AspectJ](../images/实验04-基于注解的声明式AspectJ.png)