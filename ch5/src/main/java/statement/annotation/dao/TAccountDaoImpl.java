/*
 * Date: 2021/4/4
 * Author: <https://www.github.com/shaozk>
 */

package statement.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author shaozk
 * @Description: TODO
 */
@Repository("tAccountDao")
public class TAccountDaoImpl implements TAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void out(String outUser, int money) {
        // 汇款的实现方法
        String sql = "update bank_account set money = money - ? where user =?";
        this.jdbcTemplate.update(sql, money, outUser);
    }

    @Override
    public void in(String inUser, int money) {
        // 收款的实现方法
        String sql = "update bank_account set money = money + ? where user =?";
        this.jdbcTemplate.update(sql, money, inUser);
    }
}
