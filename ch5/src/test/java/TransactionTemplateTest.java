/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */


import com.dao.TransactionTemplateDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: TODO
 */
public class TransactionTemplateTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        TransactionTemplateDao ttd = (TransactionTemplateDao) ac.getBean("transactionTemplateDao");
        String result = ttd.test();
        System.out.println(result);
    }
}
