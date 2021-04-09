/*
 * Date: 2021/4/8
 * Author: <https://www.github.com/shaozk>
 */


import com.mybatis.po.MyUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import sun.security.util.AuthResources_de;
import java.io.InputStream;
import java.util.List;

/**
 * @author shaozk
 * @Description: 测试mybatis
 */
public class MyBatisTest {
    public static void main(String[] args) {

        try{
            // 读取配置文件
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            // 根据配置文件构建SqlSessionFactory
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
            // 通过SqlSessionFactory构建SqlSession
            SqlSession ss = ssf.openSession();

            // SqlSession执行映射文件中定义的SQL，并返回映射结果
            // 查询一个用户
            MyUser user = ss.selectOne("com.mybatis.mapper.UserMapper.selectUserById", 1);
            System.out.println(user);

            // 添加一个用户
            MyUser addUser = new MyUser();
            addUser.setUname("shaozk");
            addUser.setUsex("man");
            ss.insert("com.mybatis.mapper.UserMapper.addUser", addUser);

            // 修改一个用户
            MyUser updateUser = new MyUser();
            updateUser.setUid(1);
            updateUser.setUname("weishen");
            updateUser.setUname("woman");
            ss.update("com.mybatis.mapper.UserMapper.updateUser", updateUser);

            // 删除一个用户
            ss.delete("com.mybatis.mapper.UserMapper.deleteUser", 3);

            // 查询所有用户
            List<MyUser> listUser = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
            for(MyUser u : listUser) {
                System.out.println(u);
            }

            // 提交事务
            ss.commit();
            // 关闭session
            ss.close();



        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
