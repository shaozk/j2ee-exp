/*
 * Date: 2021/4/9
 * Author: <https://www.github.com/shaozk>
 */

package com.dao;

import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * 一些数据库方法
 * @author shaozk
 */
@Repository("userDao")
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 插入数据
     * @param user
     */
    public int insert(User user) {
        String sql = "insert into user (user_id, user_name, user_sex, user_birthday, user_photo, user_resume) values (?,?,?,?,?,? )";
        Object[] obj = new Object[]{
                user.getUserId(),
                user.getUserName(),
                user.getUserSex(),
                user.getUserBirthday(),
                user.getUserPhoto(),
                user.getUserResume()
        };
        //DML操作都使用update方法。
        return jdbcTemplate.update(sql, obj);
    }

    /**
     * 删除数据
     * @param id
     */
    public int delete(int id) {
        String sql = "delete from user where user_id = ?";
        Object[] obj = new Object[]{id};
        return jdbcTemplate.update(sql, obj);
    }

    /**
     * 更新数据
     * @param user
     */
    public int update(User user) {
        String sql = "update user set user_id = ?, user_name = ?, user_sex = ?, user_birthday = ?, user_photo = ?, user_resume = ?";
        Object[] obj = new Object[]{
                user.getUserId(),
                user.getUserName(),
                user.getUserSex(),
                user.getUserBirthday(),
                user.getUserPhoto(),
                user.getUserResume()
        };
        return jdbcTemplate.update(sql, obj);
    }

    /**
     * 查询
     * @param id
     */
    public User query(int id) {
        String sql = "select * from user where user_id = ?";
        final User user = new User();
        Object[] obj = new Object[]{id};

        jdbcTemplate.query(sql, obj, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                user.setUserId(id);
                user.setUserName(rs.getString("user_name"));
                user.setUserSex(Integer.parseInt(rs.getString("user_sex")));
                user.setUserBirthday(rs.getDate("user_birthday"));
                user.setUserPhoto(rs.getBlob("user_photo"));
                user.setUserResume(rs.getString("user_resume"));
            }
        });

        return user;
    }

    /**
     * 查询所有用户
     */
    public List<User> queryAll() {
        String sql = "select * from user";
        final List<User> list = new ArrayList<User>();

        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
                user.setUserSex(Integer.parseInt(rs.getString("user_sex")));
                user.setUserBirthday(rs.getDate("user_birthday"));
                user.setUserPhoto(rs.getBlob("user_photo"));
                user.setUserResume(rs.getString("user_resume"));
                list.add(user);
            }
        });

        return list;
    }

}
