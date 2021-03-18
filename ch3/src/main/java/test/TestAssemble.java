/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package test;

import assemble.ComplexUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: 测试基于XML配置的装配方式
 */
public class TestAssemble {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 使用构造方法装配测试
        ComplexUser u1 = (ComplexUser) applicationContext.getBean("user1");
        System.out.println(u1);

        // 使用setter方法装配测试
        ComplexUser u2 = (ComplexUser) applicationContext.getBean("user2");
        System.out.println(u2);
    }
}
