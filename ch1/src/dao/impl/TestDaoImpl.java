package dao.impl;

import dao.TestDao;

public class TestDaoImpl implements TestDao {
    @Override
    public void sayHello() {
        System.out.println("hello spring !!");
    }
}
 