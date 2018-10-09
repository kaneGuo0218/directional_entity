package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StaticOrderUserdata implements Serializable {
    /**
     * static_order_userdata.user_mobile
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private String userMobile;

    /**
     * static_order_userdata.province (用户省份)
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private String province;

    /**
     * static_order_userdata.order_type (就是config_type_id)
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private Integer orderType;

    /**
     * static_order_userdata.order_count (订单数量)
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private Integer orderCount;

    /**
     * static_order_userdata.order_sumfee (付费总额)
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private BigDecimal orderSumfee;

    /**
     * static_order_userdata.last_order_time (最后一次订单提交时间)
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private Date lastOrderTime;

    /**
     * static_order_userdata.refund_count (退费次数)
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private Integer refundCount;

    /**
     * static_order_userdata.refund_sumfee (退费总额)
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private BigDecimal refundSumfee;

    /**
     * static_order_userdata.create_time (入库时间)
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private Date createTime;

    /**
     * static_order_userdata.update_time (更新时间)
     * @ibatorgenerated 2018-10-09 15:56:51
     */
    private Date updateTime;

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getOrderSumfee() {
        return orderSumfee;
    }

    public void setOrderSumfee(BigDecimal orderSumfee) {
        this.orderSumfee = orderSumfee;
    }

    public Date getLastOrderTime() {
        return lastOrderTime;
    }

    public void setLastOrderTime(Date lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
    }

    public Integer getRefundCount() {
        return refundCount;
    }

    public void setRefundCount(Integer refundCount) {
        this.refundCount = refundCount;
    }

    public BigDecimal getRefundSumfee() {
        return refundSumfee;
    }

    public void setRefundSumfee(BigDecimal refundSumfee) {
        this.refundSumfee = refundSumfee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}