/*
 * Date: 2021/4/9
 * Author: <https://www.github.com/shaozk>
 */

import com.dao.UserDao;
import com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

/**
 * UserDao测试
 * @author shaozk
 */
public class SpringJdbcTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userDao = (UserDao) applicationContext.getBean("userDao");


    @Test
    public void insert() throws FileNotFoundException {
        User user = new User();
        user.setUserId(1);
        user.setUserName("shaozk");
        user.setUserSex(0);
        user.setUserBirthday(new Date());
        user.setUserPhoto(null);

        user.setUserResume("hello,world");

        // 添加用户
        if(1 == userDao.insert(user)) {
            System.out.println("添加用户成功 ==> " + user.toString() );
        } else {
            System.out.println("添加用户失败，请稍后再试。。");
        }
    }

    @Test
    public void update() {
        // 修改用户信息
        User user = new User();
        user.setUserId(1);
        user.setUserName("kangshen");
        user.setUserSex(1);
        user.setUserBirthday(new Date());
        user.setUserPhoto(null);
        user.setUserResume("make progress every day");
        assert userDao.update(user) == 1;

        if(1 == userDao.update(user)) {
            System.out.println("修改用户信息成功 ==> " + user.toString() );
        } else {
            System.out.println("修改用户信息失败，请稍后再试。。");
        }

    }

    @Test
    public void delete() {
        if(1 == userDao.delete(1)) {
            System.out.println("删除用户成功");
        } else {
            System.out.println("删除用户失败");
        }
    }

    @Test
    public void query() {
        User user = userDao.query(1);
        if (user != null) {
            System.out.println("查询用户成功 == 》" + user);
        } else {
            System.out.println("找不到该用户");
        }
    }

    @Test
    public void queryAll() {
        List<User> list = userDao.queryAll();
        if(list != null) {
            System.out.println("查询成功");
            for(User u : list) {
                System.out.println(u);
            }
        } else {
            System.out.println("查询失败，请稍后再试");
        }
    }

}
