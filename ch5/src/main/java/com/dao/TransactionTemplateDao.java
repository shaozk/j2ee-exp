/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author shaozk
 * @Description: TODO
 */
@Repository("transactionTemplateDao")
public class TransactionTemplateDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private TransactionTemplate transactionTemplate;
    String message = "";
    public String test() {
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                String sql = "delete from user";
                String insertSql = "insert into ;user values(?,?,?)";
                Object param[] = {1, "shaozk", "男"};
                try {
                    jdbcTemplate.update(sql);
                    jdbcTemplate.update(insertSql, param);
                    jdbcTemplate.update(insertSql, param);
                    message = "执行成功，没有事务回滚";
                } catch (Exception e) {
                    message = "主键重复，事务回滚";
                    e.printStackTrace();
                }
                return message;
            }
        });
        return message;
    }
}
