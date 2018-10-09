package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StaticOrderType implements Serializable {
    /**
     * static_order_type.config_type_id (配置类型表ID)
     * @ibatorgenerated 2018-10-09 15:56:43
     */
    private Long configTypeId;

    /**
     * static_order_type.product_type (类型名称)
     * @ibatorgenerated 2018-10-09 15:56:43
     */
    private String productType;

    /**
     * static_order_type.order_count (已支付订单数量)
     * @ibatorgenerated 2018-10-09 15:56:43
     */
    private Integer orderCount;

    /**
     * static_order_type.order_fee (已支付金额)
     * @ibatorgenerated 2018-10-09 15:56:43
     */
    private BigDecimal orderFee;

    /**
     * static_order_type.refund_count (退款订单数)
     * @ibatorgenerated 2018-10-09 15:56:43
     */
    private Integer refundCount;

    /**
     * static_order_type.refund_fee (退款金额)
     * @ibatorgenerated 2018-10-09 15:56:43
     */
    private BigDecimal refundFee;

    /**
     * static_order_type.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:43
     */
    private Date createTime;

    /**
     * static_order_type.update_time (更新时间)
     * @ibatorgenerated 2018-10-09 15:56:43
     */
    private Date updateTime;

    public Long getConfigTypeId() {
        return configTypeId;
    }

    public void setConfigTypeId(Long configTypeId) {
        this.configTypeId = configTypeId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
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