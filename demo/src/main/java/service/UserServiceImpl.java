/*
 * Date: 2021/5/14
 * Author: <https://www.github.com/shaozk>
 */

package service;

import org.springframework.stereotype.Service;
import pojo.UserForm;

/**
 * TODO
 *
 * @author shaozk
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public boolean login(UserForm user) {
        if("shaozk".equals(user.getUname())
                && "123456".equals(user.getUpass()))
            return true;
        return false;
    }
    @Override
    public boolean register(UserForm user) {
        if("shaozk".equals(user.getUname())
                && "123456".equals(user.getUpass()))
            return true;
        return false;
    }
}
