/*
 * Date: 2021/5/7
 * Author: <https://www.github.com/shaozk>
 */

package com.pojo;

import com.po.Customer;
import com.po.FinancialProducts;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 *
 * @author shaozk
 */
@Data
public class SelectBatchAndCustomerAndProducts {
    private Integer batchId;
    private Integer cusId;
    private String number;
    private Date createTime;
    private String note;

    // 用户信息
    private Customer customer;
    // 理财产品信息
    private List<FinancialProducts> products;

    @Override
    public String toString() {
        return "SelectBatchAndCustomerAndProducts{" +
                "batchId=" + batchId +
                ", cusId=" + cusId +
                ", number='" + number + '\'' +
                ", createTime=" + createTime +
                ", note='" + note + '\'' +
                "\n" +      // 方便查看结果
                ", customer=" + customer +
                "\n" +
                ", products=" + products +
                '}';
    }
}
