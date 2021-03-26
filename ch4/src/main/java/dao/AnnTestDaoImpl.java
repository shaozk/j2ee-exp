/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package dao;

import org.springframework.stereotype.Repository;

/**
 * @author shaozk
 * @Description: ann dao的实现类
 */
@Repository("testDaoImpl")
public class AnnTestDaoImpl implements ANNTestDao{
    @Override
    public void save(String action) {
        System.out.println("保存");
    }
}
