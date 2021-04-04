/*
 * Date: 2021/4/4
 * Author: <https://www.github.com/shaozk>
 */

package statement.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import statement.annotation.service.TAccountService;

/**
 * @author shaozk
 * @Description: TODO
 */
@Controller("tAccountController")
public class TAccountController {
    @Autowired
    private TAccountService tAccountService;

    public void test() {
        try {
            tAccountService.transfer();
        } catch (Exception e) {
            System.out.println("事务异常，回滚");
        }
    }
}
