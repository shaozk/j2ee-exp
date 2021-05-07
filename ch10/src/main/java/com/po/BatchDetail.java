/*
 * Date: 2021/5/7
 * Author: <https://www.github.com/shaozk>
 */

package com.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 批次明细
 * @author shaozk
 */
@Setter
@Getter
@ToString
public class BatchDetail {
    private Integer id;
    private Integer productId;
    private Integer batchId;
    private Integer productNum;
}
