/*
 * File Created at 2021/3/12
 * Author <https://www.github.com/shaozk>
 */

package com.dao.impl;

import com.dao.TestDao;

/**
 * @author shaozk
 * @Description: TestDao的实现类
 */
public class TestDaoImpl implements TestDao {

    @Override
    public void sayHello() {
        System.out.println("hello spring");
    }
}
