package com.zdmoney.models.order;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ViewOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.ORDER_NUM
     *
     * @mbggenerated
     */
    private String orderNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CUSTOMER_ID
     *
     * @mbggenerated
     */
    private Long customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.ORDER_AMT
     *
     * @mbggenerated
     */
    private BigDecimal orderAmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.PRODUCT_ID
     *
     * @mbggenerated
     */
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.ORDER_TIME
     *
     * @mbggenerated
     */
    private Date orderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.YEAR_RATE
     *
     * @mbggenerated
     */
    private BigDecimal yearRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.INTEREST_START_DATE
     *
     * @mbggenerated
     */
    private Date interestStartDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.INTEREST_END_DATE
     *
     * @mbggenerated
     */
    private Date interestEndDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.PRINCIPALINTEREST
     *
     * @mbggenerated
     */
    private BigDecimal principalinterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CUSTOMER_NAME
     *
     * @mbggenerated
     */
    private String customerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.INVITE_CODE
     *
     * @mbggenerated
     */
    private String inviteCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CONFIRM_PAYMENT_DATE
     *
     * @mbggenerated
     */
    private Date confirmPaymentDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.PAY_SER_NUM
     *
     * @mbggenerated
     */
    private String paySerNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.BANK_ACCOUNT_ID
     *
     * @mbggenerated
     */
    private Long bankAccountId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CM_OPEN_MECHANISM
     *
     * @mbggenerated
     */
    private String cmOpenMechanism;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CM_OPEN_PLATFORM
     *
     * @mbggenerated
     */
    private String cmOpenPlatform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CM_TOGATHER_TYPE
     *
     * @mbggenerated
     */
    private String cmTogatherType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CM_OPEN_CHANNEL
     *
     * @mbggenerated
     */
    private String cmOpenChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CM_REGISTER_VERSION
     *
     * @mbggenerated
     */
    private String cmRegisterVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.IS_FIRST_ORDER
     *
     * @mbggenerated
     */
    private Long isFirstOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.ORIGINAL_RATE
     *
     * @mbggenerated
     */
    private BigDecimal originalRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.INVTE_RATE
     *
     * @mbggenerated
     */
    private BigDecimal invteRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.ACTION_RATE
     *
     * @mbggenerated
     */
    private BigDecimal actionRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.YEAR_RATE_STR
     *
     * @mbggenerated
     */
    private String yearRateStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.DAY_PROFIT
     *
     * @mbggenerated
     */
    private BigDecimal dayProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.RAISE_DAY_PROFIT
     *
     * @mbggenerated
     */
    private BigDecimal raiseDayProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.RAISE_DAYS
     *
     * @mbggenerated
     */
    private Long raiseDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CLOSE_DAYS
     *
     * @mbggenerated
     */
    private Long closeDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.PRODUCT_TYPE
     *
     * @mbggenerated
     */
    private String productType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.SUBJECT_STATUS
     *
     * @mbggenerated
     */
    private String subjectStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.PAY_TYPE
     *
     * @mbggenerated
     */
    private String payType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.TRANSFER_TYPE
     *
     * @mbggenerated
     */
    private String transferType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.MODIFY_DATE
     *
     * @mbggenerated
     */
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.RAISE_RATE_INCOME
     *
     * @mbggenerated
     */
    private BigDecimal raiseRateIncome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.COUPON_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal couponAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.INTEGRAL_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal integralAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.CASH_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal cashAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.DEBTOR_NUM
     *
     * @mbggenerated
     */
    private String debtorNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAOCAIBAO.VIEW_ORDER.DEBTOR_NAME
     *
     * @mbggenerated
     */
    private String debtorName;
}