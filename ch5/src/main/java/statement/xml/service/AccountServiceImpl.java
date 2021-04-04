/*
 * Date: 2021/4/2
 * Author: <https://www.github.com/shaozk>
 */

package statement.xml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import statement.xml.dao.AccountDao;

/**
 * @author shaozk
 * @Description: TODO
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    public void addUser() {
        accountDao.addUser("wei", 100);
        accountDao.addUser("shaozk", 100);
    }

    @Override
    public void transfer() {
        // 转账
        this.accountDao.out("wei", 10);
        this.accountDao.in("shaozk", 10);
        System.out.println("转账成功!");
        this.accountDao.out("wei", 100);
        this.accountDao.in("shaozk", 100);
        System.out.println("转账成功!");

    }
}
