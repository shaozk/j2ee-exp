/*
 * Date: 2021/4/30
 * Author: <https://www.github.com/shaozk>
 */

package com.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * TODO
 *
 * @author shaozk
 */
@Setter
@Getter
@ToString
public class SelectPersonById {
    private Integer id;
    private String name;
    private Integer age;
    private String code;

}
