/*
 * Name: Test
 * Data: 2021/3/12
 * Author: <https://www.github.com/shaozk>
 */

package test;

import com.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: 测试
 */
public class Test {
    public static void main(String[] args) {
        // 初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContest.xml");

        // 通过容器获取test实例
        TestDao testDao = (TestDao) app.getBean("test");	// test为配置文件中的id
        testDao.sayHello();
    }

}