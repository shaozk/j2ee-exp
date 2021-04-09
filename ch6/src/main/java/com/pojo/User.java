/*
 * Date: 2021/4/9
 * Author: <https://www.github.com/shaozk>
 */

package com.pojo;

import java.sql.Blob;
import java.util.Arrays;
import java.util.Date;

/**
 * @author shaozk
 * @Description: 用户类
 */
public class User {
    private int userId;
    private String userName;
    private int userSex;
    private Date userBirthday;
    private Blob userPhoto;
    private String userResume;

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Blob getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(Blob userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserResume() {
        return userResume;
    }

    public void setUserResume(String userResume) {
        this.userResume = userResume;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userBirthday=" + userBirthday +
                ", userPhoto=" + userPhoto +
                ", userResume='" + userResume + '\'' +
                '}';
    }
}
