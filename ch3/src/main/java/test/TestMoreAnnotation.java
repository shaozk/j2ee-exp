/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package test;

import annotation.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: TODO
 */
public class TestMoreAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationContext.xml");
        TestController testController = (TestController) applicationContext.getBean("testController");
        testController.save();
    }
}
