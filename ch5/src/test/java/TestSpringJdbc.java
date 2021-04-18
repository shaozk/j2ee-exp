/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

import com.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.MyUser;

import java.util.List;

/**
 * @author shaozk
 * @Description: TODO
 */
public class TestSpringJdbc {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDao = (TestDao) applicationContext.getBean("testDao");
        String insertSql = "insert into User values (?,?,?)";
        Object param1[] = {1,"shaozk1", "男"};
        Object param2[] = {2,"shaozk2", "男"};
        Object param3[] = {3,"shaozk3", "男"};
        Object param4[] = {4,"shaozk4", "男"};
        testDao.update(insertSql, param1);
        testDao.update(insertSql, param2);
        testDao.update(insertSql, param3);
        testDao.update(insertSql, param4);
        // 查询用户
        String selectSql = "select * from User";
        List<MyUser> list = testDao.query(selectSql, null);
        for(MyUser u : list) {
            System.out.println(u);
        }
    }
}
