/*
 * Date: 2021/5/7
 * Author: <https://www.github.com/shaozk>
 */

package com.pojo;

import com.po.Batch;
import com.po.Customer;
import com.po.FinancialProducts;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author shaozk
 */
@Data
public class SelectCustomerAndBatchAndProducts {
    private Integer cusId;
    private String userName;
    private String acno;
    private String gender;
    private String phone;

    // 用户信息
    private Batch batch;
    // 理财产品信息
    private List<FinancialProducts> products;

    @Override
    public String toString() {
        return "SelectCustomerAndBatchAndProducts{" +
                "cusId=" + cusId +
                ", userName='" + userName + '\'' +
                ", acno='" + acno + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                "\n" +      // 方便查看结果
                ", batch=" + batch +
                "\n" +
                ", products=" + products +
                '}';
    }
}
