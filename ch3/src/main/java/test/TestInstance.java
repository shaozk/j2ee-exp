/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package test;

import instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: 测试类
 */
public class TestInstance {
    public static void main(String[] args) {
        // 初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 测试构造方法实例化
        BeanClass b1 = (BeanClass) applicationContext.getBean("constructorInstance");
        System.out.println(b1 + b1.message);

        // 测试静态工厂方法实例化
        BeanClass b2 = (BeanClass) applicationContext.getBean("staticFactoryInstance");
        System.out.println(b2 + b2.message);

        // 测试实例化工厂方法实例化
        BeanClass b3 = (BeanClass) applicationContext.getBean("instanceFactory");
        System.out.println(b3 + b3.message);
    }

}
