/*
 * Date: 2021/4/30
 * Author: <https://www.github.com/shaozk>
 */

package com.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 数据库中idcard表的持久化类
 * @author shaozk
 */
@Setter
@Getter
@ToString
public class Idcard {
    private Integer id;
    private String code;
}
