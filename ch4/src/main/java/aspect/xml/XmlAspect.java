/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package aspect.xml;

import org.aspectj.lang.JoinPoint;

import static java.lang.System.exit;

/**
 * @author shaozk
 * @Description: 切面类
 */
public class XmlAspect {
    // 前置通知
    public void before(JoinPoint joinPoint) {
        System.out.println("基于XML的声明式AspectJ");

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
