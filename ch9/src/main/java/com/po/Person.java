/*
 * Date: 2021/4/30
 * Author: <https://www.github.com/shaozk>
 */

package com.po;

import com.po.Idcard;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 数据库中person表的持久化类
 * @author shaozk
 */
@Getter
@Setter
@ToString
public class Person {
    private Integer id;
    private Integer age;
    private String name;
    private Idcard card;

}
