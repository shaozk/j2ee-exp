/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package spring.proxyfactorybean;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: TODO
 */
public class ProFactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("daoAdviceContext.xml");
        TestDao testDaoAdvice = (TestDao) applicationContext.getBean("testDaoProxy");
        // 执行方法
        testDaoAdvice.save();
        System.out.println("==========");
        testDaoAdvice.modify();
        System.out.println("==========");
        testDaoAdvice.delete();
    }
}
