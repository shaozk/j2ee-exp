/*
 * Date: 2021/3/12
 * Author: <https://www.github.com/shaozk>
 */

package com.smart.web;

/**
 * @author shaozk
 * @Description: TODO
 */
public class LoginCommand {
    private String userName;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
