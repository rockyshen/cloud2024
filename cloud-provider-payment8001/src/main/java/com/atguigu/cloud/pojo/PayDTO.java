package com.atguigu.cloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayDTO implements Serializable {
    private Integer id;

    private String payNo;          // 支付流水号

    private String orderNo;        // 订单流水号

    private Integer userId;        // 用户账号ID

    private BigDecimal amount;     // 交易金额
}
