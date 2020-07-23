package com.zdmoney.webservice.api.dto.plan;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangp on 2017/10/17
 **/
@Data
public class BusiMatchExceptionVO implements Serializable {

    private Long id;
    /**
     * ��������
     */
    private String orderNum;

    /**
     * ��Ƽƻ�ID
     */
    private Long productId;

    /**
     * ���������
     */
    private Long orderId;


    /**
     * ״̬ 0-������ 1-�Ѵ���
     */
    private String status;

    /**
     * �ʽ���
     */
    private String fundId;

    /**
     * ���ծȨ���
     */
    private String financeId;

    /**
     * ��������
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * �޸�����
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date modifyDate;


}
