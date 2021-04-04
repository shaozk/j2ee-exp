/*
 * Date: 2021/4/2
 * Author: <https://www.github.com/shaozk>
 */

package statement.xml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import statement.xml.service.AccountService;

/**
 * @author shaozk
 * @Description:
 */
@Controller("accountController")
public class AccountController {
    @Autowired
    private AccountService accountService;

    public void addUser() {
        accountService.addUser();
        System.out.println("添加用户成功");
    }

    public void test() {
        try {
            accountService.transfer();
        } catch (Exception e) {
            System.out.println("事务异常，回滚");
        }
    }
}
