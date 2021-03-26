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
