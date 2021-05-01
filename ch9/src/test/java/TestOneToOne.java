/*
 * Date: 2021/4/30
 * Author: <https://www.github.com/shaozk>
 */

import com.controller.OneToOneController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 */
public class TestOneToOne {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OneToOneController oto = (OneToOneController) applicationContext.getBean("oneToOneController");
        oto.test();
    }
}
