/*
 * Date: 2021/4/4
 * Author: <https://www.github.com/shaozk>
 */

package statement.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import statement.annotation.dao.TAccountDao;

/**
 * @author shaozk
 * @Description: TODO
 */
@Service("tAccountService")
@Transactional
public class TAccountServiceImpl implements TAccountService{

    @Autowired
    private TAccountDao taccountDao;

    @Override
    public void transfer() {
        this.taccountDao.out("wei", 10);
        this.taccountDao.in("shaozk", 10);
        System.out.println("转账成功!");
        this.taccountDao.out("wei", 100);
        this.taccountDao.in("shaozk", 100);
        System.out.println("转账成功!");
    }
}
