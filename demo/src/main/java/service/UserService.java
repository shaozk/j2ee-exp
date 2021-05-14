/*
 * Date: 2021/5/14
 * Author: <https://www.github.com/shaozk>
 */

package service;

import pojo.UserForm;

/**
 * @author shaozk
 */
public interface UserService {
    boolean login(UserForm user);
    boolean register(UserForm user);
}
