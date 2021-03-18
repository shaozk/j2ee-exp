/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package test;

import life.BeanLife;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: 测试声明周期
 */
public class TestLife {
    public static void main(String[] args) {
        // 初始化Spring容器，加载配置文件
        // 为了方便演示销毁的方法，使用ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("获得对象前");
        BeanLife bLife = (BeanLife) applicationContext.getBean("beanLife");
        System.out.println("获得对象后：" + bLife);
        applicationContext.close();
    }
}
