/*
 * Date: 2021/5/7
 * Author: <https://www.github.com/shaozk>
 */

package com.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 *
 * @author shaozk
 */
@Getter
@Setter
@ToString
public class SelectBatchAndCustomer {
    // 注意pojo里不要写驼峰名
    private Integer batch_id;
    private Integer cus_id;
    private String number;
    private Date createTime;
    private String note;
    private String userName;
    private String acno;
    private String gender;
    private String phone;
}
