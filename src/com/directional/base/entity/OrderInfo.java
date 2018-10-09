package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo implements Serializable {
    /**
     * order_info.order_info_id (订单号)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String orderInfoId;

    /**
     * order_info.user_mobile (用户手机号)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String userMobile;

    /**
     * order_info.channel_product_code_id (渠道产品代码表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long channelProductCodeId;

    /**
     * order_info.channel_info_id (渠道信息表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long channelInfoId;

    /**
     * order_info.config_type_id (配置类型表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long configTypeId;

    /**
     * order_info.order_time (订购时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date orderTime;

    /**
     * order_info.order_payvalid_time (订单支付有效时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date orderPayvalidTime;

    /**
     * order_info.order_pay_time (订单支付时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date orderPayTime;

    /**
     * order_info.order_valid_time (订单失效时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date orderValidTime;

    /**
     * order_info.user_province (用户省份)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String userProvince;

    /**
     * order_info.order_type (支付类型 1：现金 2：话费  3：微信  4：支付宝)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer orderType;

    /**
     * order_info.order_state (订单状态  0:未支付 1：正常 2：退款  3：订单失效 4:用户退订 5：失败 6：支付成功，联通订购失败)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer orderState;

    /**
     * order_info.order_fee (订单金额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private BigDecimal orderFee;

    /**
     * order_info.real_fee (实付金额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private BigDecimal realFee;

    /**
     * order_info.refund_type (退费类型  1：现金 2：话费  3：微信  4：支付宝)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer refundType;

    /**
     * order_info.refund_fee (退费金额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private BigDecimal refundFee;

    /**
     * order_info.order_search (搜索字段)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String orderSearch;

    /**
     * order_info.order_json (订单快照)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String orderJson;

    /**
     * order_info.order_by_type (订单类型  1：普通 2：包月)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer orderByType;

    /**
     * order_info.unicomOrderId (联通返回的订购ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String unicomorderid;

    public String getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Long getChannelProductCodeId() {
        return channelProductCodeId;
    }

    public void setChannelProductCodeId(Long channelProductCodeId) {
        this.channelProductCodeId = channelProductCodeId;
    }

    public Long getChannelInfoId() {
        return channelInfoId;
    }

    public void setChannelInfoId(Long channelInfoId) {
        this.channelInfoId = channelInfoId;
    }

    public Long getConfigTypeId() {
        return configTypeId;
    }

    public void setConfigTypeId(Long configTypeId) {
        this.configTypeId = configTypeId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderPayvalidTime() {
        return orderPayvalidTime;
    }

    public void setOrderPayvalidTime(Date orderPayvalidTime) {
        this.orderPayvalidTime = orderPayvalidTime;
    }

    public Date getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public Date getOrderValidTime() {
        return orderValidTime;
    }

    public void setOrderValidTime(Date orderValidTime) {
        this.orderValidTime = orderValidTime;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public BigDecimal getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(BigDecimal orderFee) {
        this.orderFee = orderFee;
    }

    public BigDecimal getRealFee() {
        return realFee;
    }

    public void setRealFee(BigDecimal realFee) {
        this.realFee = realFee;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public BigDecimal getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(BigDecimal refundFee) {
        this.refundFee = refundFee;
    }

    public String getOrderSearch() {
        return orderSearch;
    }

    public void setOrderSearch(String orderSearch) {
        this.orderSearch = orderSearch;
    }

    public String getOrderJson() {
        return orderJson;
    }

    public void setOrderJson(String orderJson) {
        this.orderJson = orderJson;
    }

    public Integer getOrderByType() {
        return orderByType;
    }

    public void setOrderByType(Integer orderByType) {
        this.orderByType = orderByType;
    }

    public String getUnicomorderid() {
        return unicomorderid;
    }

    public void setUnicomorderid(String unicomorderid) {
        this.unicomorderid = unicomorderid;
    }
}