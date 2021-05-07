package com.mapper;

import com.po.Batch;
import com.pojo.SelectBatchAndCustomer;
import com.pojo.SelectBatchAndCustomerAndProducts;
import com.pojo.SelectCustomerAndBatchAndProducts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CustomerMapperTest {
    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void selectBatchAndCustomer() {
        SelectBatchAndCustomer sbac = customerMapper.selectBatchAndCustomer(1);
        System.out.println(sbac);
    }

    @Test
    public void selectBatchAndCustomerAndProduct() {
        List<SelectBatchAndCustomerAndProducts> bList = customerMapper.selectBatchAndCustomerAndProduct(1);
        for(SelectBatchAndCustomerAndProducts b : bList) {
            System.out.println(b);
        }
    }

    @Test
    public void selectAllBatchAndCustomerAndProduct() {
        List<SelectCustomerAndBatchAndProducts> bList = customerMapper.selectAllBatchAndCustomerAndProduct();
        for(SelectCustomerAndBatchAndProducts b : bList) {
            System.out.println(b);
            System.out.println("==========");
        }
    }
}