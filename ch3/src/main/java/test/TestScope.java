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
 * @Description: singleton作用域
 */
public class TestScope {

    public static void main(String[] args) {
        // 初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 测试构造方法实例化Bean
        BeanClass b1 = (BeanClass) applicationContext.getBean("constructorInstance");
        System.out.println(b1);

        BeanClass b2 = (BeanClass) applicationContext.getBean("constructorInstance");
        System.out.println(b2);

    }


}
