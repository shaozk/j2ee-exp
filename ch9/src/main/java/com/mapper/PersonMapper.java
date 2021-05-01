/*
 * Date: 2021/4/30
 * Author: <https://www.github.com/shaozk>
 */

package com.mapper;

import com.po.Person;
import com.pojo.SelectPersonById;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author shaozk
 */
@Mapper
public interface PersonMapper {
    public Person selectPersonById1(Integer id);
    public Person selectPersonById2(Integer id);
    public SelectPersonById selectPersonById3(Integer id);

}

