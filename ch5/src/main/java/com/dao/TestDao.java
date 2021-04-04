/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package com.dao;

import pojo.MyUser;

import java.util.List;

/**
 * @author shaozk
 * @Description: TODO
 */
public interface TestDao {
    public int update(String sql, Object[] param);
    public List<MyUser> query(String sql, Object [] param);
}
