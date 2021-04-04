/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dao.CodeTransaction;

/**
 * @author shaozk
 * @Description: TODO
 */
public class TestCodeTransaction {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CodeTransaction ct = (CodeTransaction) ac.getBean("codeTransaction");
        String result = ct.test();
        System.out.println(result);
    }
}
