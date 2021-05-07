/*
 * Date: 2021/5/7
 * Author: <https://www.github.com/shaozk>
 */

package com.mapper;

import com.po.Batch;
import com.po.Customer;
import com.pojo.SelectBatchAndCustomer;
import com.pojo.SelectBatchAndCustomerAndProducts;
import com.pojo.SelectCustomerAndBatchAndProducts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shaozk
 */
@Mapper
@Repository
public interface CustomerMapper {
    public SelectBatchAndCustomer selectBatchAndCustomer(Integer id);
    public List<SelectBatchAndCustomerAndProducts> selectBatchAndCustomerAndProduct(Integer id);
    public List<SelectCustomerAndBatchAndProducts> selectAllBatchAndCustomerAndProduct();
}
