/*
 * Date: 2021/4/30
 * Author: <https://www.github.com/shaozk>
 */

package com.controller;

import com.mapper.PersonMapper;
import com.po.Person;
import com.pojo.SelectPersonById;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * TODO
 *
 * @author shaozk
 */
@Controller("oneToOneController")
public class OneToOneController {
    @Autowired
    private PersonMapper personMapper;

    public void test() {
        Person p1 = personMapper.selectPersonById1(1);
        System.out.println(p1);
        System.out.println("==========");

        Person p2 = personMapper.selectPersonById2(1);
        System.out.println(p2);
        System.out.println("==========");

        SelectPersonById p3 = personMapper.selectPersonById3(1);
        System.out.println(p3);
    }
}
