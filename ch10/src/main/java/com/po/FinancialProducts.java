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
 * 理财产品
 * @author shaozk
 */
@Getter
@Setter
@ToString
public class FinancialProducts {
    private Integer productId;
    private String name;
    private Float price;
    private String detail;
    private String pic;
    private Date invastTime;

    private List<Batch> batches;


}
