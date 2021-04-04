/*
 * Date: 2021/4/2
 * Author: <https://www.github.com/shaozk>
 */

package statement.xml.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author shaozk
 * @Description: 账户转账实现类
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(String user, int money) {
        // 添加账户
        String sql = "insert into bank_account values(null, ?,?)";
        this.jdbcTemplate.update(sql, user, money);
    }

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
