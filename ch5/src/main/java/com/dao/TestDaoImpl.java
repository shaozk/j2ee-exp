/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pojo.MyUser;

import java.util.List;

/**
 * @author shaozk
 * @Description: TODO
 */
@Repository("testDao")
public class TestDaoImpl implements TestDao{
    @Autowired
    // 使用配置文件中的jdbc模板
    private JdbcTemplate jdbcTemplate;

    @Override
    public int update(String sql, Object[] param) {
        return jdbcTemplate.update(sql, param);
    }

    @Override
    public List<MyUser> query(String sql, Object[] param) {
        RowMapper<MyUser> rowMapper = new BeanPropertyRowMapper<MyUser>(MyUser.class);
        return jdbcTemplate.query(sql, rowMapper, param);
    }
}
