/*
 * Date: 2021/4/4
 * Author: <https://www.github.com/shaozk>
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import statement.annotation.controller.TAccountController;

/**
 * @author shaozk
 * @Description: TODO
 */
public class TransactionTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotationstatementapplicationContext.xml");
        TAccountController tac = (TAccountController) ac.getBean("tAccountController");
        tac.test();
    }
}
