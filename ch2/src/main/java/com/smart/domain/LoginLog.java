/*
 * Date: 2021/3/12
 * Author: <https://www.github.com/shaozk>
 */

package com.smart.domain;

import java.util.Date;

/**
 * @author shaozk
 * @Description: TODO
 */
public class LoginLog {
    private int loginLogId;

    private int userId;

    private String ip;

    private Date loginDate;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
