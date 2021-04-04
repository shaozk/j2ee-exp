/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import statement.xml.controller.AccountController;


/**
 * @author shaozk
 * @Description: TODO
 */
public class XMLText {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("xmlStatementApplicationContext.xml");
        AccountController ct = (AccountController) ac.getBean("accountController");
//        ct.addUser();
        ct.test();

    }
}
