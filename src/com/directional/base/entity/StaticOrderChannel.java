package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StaticOrderChannel implements Serializable {
    /**
     * static_order_channel.channel_info_id (渠道信息表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long channelInfoId;

    /**
     * static_order_channel.config_count (配置数量)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer configCount;

    /**
     * static_order_channel.user_count (付费人数)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer userCount;

    /**
     * static_order_channel.order_count (付费次数)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer orderCount;

    /**
     * static_order_channel.order_sumfee (付费总额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private BigDecimal orderSumfee;

    /**
     * static_order_channel.last_order_time (最后一次订单提交时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date lastOrderTime;

    /**
     * static_order_channel.refund_count (退费次数)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer refundCount;

    /**
     * static_order_channel.refund_sumfee (退费总额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private BigDecimal refundSumfee;

    /**
     * static_order_channel.create_time (入库时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date createTime;

    /**
     * static_order_channel.update_time (更新时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date updateTime;

    public Long getChannelInfoId() {
        return channelInfoId;
    }

    public void setChannelInfoId(Long channelInfoId) {
        this.channelInfoId = channelInfoId;
    }

    public Integer getConfigCount() {
        return configCount;
    }

    public void setConfigCount(Integer configCount) {
        this.configCount = configCount;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
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