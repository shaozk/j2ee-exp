/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package dao;

import org.springframework.stereotype.Repository;

/**
 * @author shaozk
 * @Description: TODO
 */
@Repository("testDaoImpl")
public class TestDaoImpl implements TestDao {

    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void modify() {
        System.out.println("修改");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }
}
