/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author shaozk
 * @Description: TODO
 */
@Repository("codeTransaction")
public class CodeTransaction {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DataSourceTransactionManager txManager;
    public String test() {
        TransactionDefinition tf = new DefaultTransactionDefinition();
        TransactionStatus ts = txManager.getTransaction(tf);
        String message = "执行成功，没有事务回滚";
        try {
            // 删除表中数据
            String sql = "delete from user";
            String addSql = "insert into user values(?,?,?)";
            Object param[] = {1, "shaozk", "男"};
            jdbcTemplate.update(sql);
            jdbcTemplate.update(addSql, param);
            // 使得主键重复
            jdbcTemplate.update(addSql, param);
            // 提交事务
            txManager.commit(ts);
        } catch (Exception e) {
            txManager.rollback(ts);
            message = "主键重复，事务回滚";
            e.printStackTrace();
        }
        return message;
    }
}
