/*
 * Date: 2021/5/7
 * Author: <https://www.github.com/shaozk>
 */

package com.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * 批次
 * @author shaozk
 */
@Setter
@Getter
@ToString
public class Batch {
    private Integer batchId;
    private Integer cusId;
    private String number;
    private Date createTime;
    private String note;
}
