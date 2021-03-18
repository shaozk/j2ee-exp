/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author shaozk
 * @Description: TODO
 */
@Repository("testDaoImpl")
public class TestDaoImpl implements TestDao{
    @Override
    public void save() {
        System.out.println("TestDao save()");
    }
}
