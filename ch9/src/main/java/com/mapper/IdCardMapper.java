/*
 * Date: 2021/4/30
 * Author: <https://www.github.com/shaozk>
 */

package com.mapper;

import com.po.Idcard;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author shaozk
 */
@Mapper
public interface IdCardMapper {
    public Idcard selectCodeById(Integer i);
}
