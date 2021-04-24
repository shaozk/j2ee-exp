package mapper;

import com.mysql.jdbc.Blob;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import pojo.MUser;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    MUser user = new MUser();

    @Test
    public void addUser() throws FileNotFoundException {
        user.setUserName("kangshen");
        user.setUserSex("man");
        user.setUserBirthday(new Date());
        user.setUserPhoto(new Byte[]{});
        user.setUserResume("hello world");

        // 保存用户
        int au = userMapper.addUser(user);
        System.out.println("添加了" + au + "条记录");;

    }

    @Test
    public void deleteUser() {
       int du = userMapper.deleteUser(2);
        System.out.println("删除了" + du + "条记录");
    }

    @Test
    public void updateUser() {
        user.setUserResume("someone wait you");
        int uu = userMapper.updateUser(user);
        System.out.println("更新了" + uu + "条记录");
    }

    @Test
    public void queryUserById() {
        MUser user = userMapper.queryUserById(1);
        System.out.println(user);

    }

    @Test
    public void queryUserByName() {
        MUser user = userMapper.queryUserByName("shaozk");
        System.out.println(user);
    }

    @Test
    public void queryAllUser() {
        List<MUser> list = userMapper.queryAllUser();
        for(MUser user : list) {
            System.out.println(user);
        }
    }
}