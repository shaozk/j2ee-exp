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
