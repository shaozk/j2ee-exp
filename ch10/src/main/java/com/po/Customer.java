/*
 * Date: 2021/5/7
 * Author: <https://www.github.com/shaozk>
 */

package com.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户
 * @author shaozk
 */
@Setter
@Getter
@ToString
public class Customer {
    private Integer cusId;
    private String userName;
    private String acno;
    private String gender;
    private String phone;
}
