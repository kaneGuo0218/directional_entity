package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StaticOrderArea implements Serializable {
    /**
     * static_order_area.province (省份)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String province;

    /**
     * static_order_area.order_count (已支付订单数量)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer orderCount;

    /**
     * static_order_area.order_fee (已支付金额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private BigDecimal orderFee;

    /**
     * static_order_area.refund_count (退款订单数)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer refundCount;

    /**
     * static_order_area.refund_fee (退款金额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private BigDecimal refundFee;

    /**
     * static_order_area.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date createTime;

    /**
     * static_order_area.update_time (更新时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date updateTime;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(BigDecimal orderFee) {
        this.orderFee = orderFee;
    }

    public Integer getRefundCount() {
        return refundCount;
    }

    public void setRefundCount(Integer refundCount) {
        this.refundCount = refundCount;
    }

    public BigDecimal getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(BigDecimal refundFee) {
        this.refundFee = refundFee;
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