package com.zdmoney.webservice.api.dto.customer;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2019/1/8 0008.
 */
@Data
public class CustomerRatingConfigDto implements Serializable{
    /**
     * 用户等级编码：iron copper silver gold platinum diamond infinate
     */
    private String ratingCode;
    /**
     * 用户等级描述：铁象  铜象   银象  金象  白金象   钻石象   无极象
     */
    private String ratingDescr;
    /**
     * 用户等级数值：1 3 5 7 9 11 13
     */
    private Integer ratingNum;

    private BigDecimal minInvestingAmt;//在投金额下限

    private BigDecimal maxInvestingAmt;//在投金额上限
    /**
     * 返利积分比例
     */
    private BigDecimal rebateCreditRate;
    /**
     * 投资积分比例
     */
    private BigDecimal investmentCreditRate;
    /**
     * 升级到下一级别积分奖励
     */
    private Integer upgradingCredit;
    /**
     * 月度礼包
     */
    private String monthlyPresent;
    /**
     * 月度礼包类型:credit-积分，cash_ticket - 现金券
     */
    private String monthlyPresentType;
    /**
     * 续投年利率增加数量
     */
    private BigDecimal rolloverInterestRate;
}
