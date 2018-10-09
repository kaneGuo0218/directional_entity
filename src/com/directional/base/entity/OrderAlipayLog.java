package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderAlipayLog implements Serializable {
    /**
     * order_alipay_log.order_info_id (订单号)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String orderInfoId;

    /**
     * order_alipay_log.notify_time (通知的发送时间。格式为yyyy-MM-dd HH:mm:ss。)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private Date notifyTime;

    /**
     * order_alipay_log.notify_type (通知类型)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String notifyType;

    /**
     * order_alipay_log.notify_id (通知校验ID)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String notifyId;

    /**
     * order_alipay_log.sign_type (签名方式)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String signType;

    /**
     * order_alipay_log.sign (签名)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String sign;

    /**
     * order_alipay_log.subject (商品名称)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String subject;

    /**
     * order_alipay_log.payment_type (支付类型)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String paymentType;

    /**
     * order_alipay_log.trade_no (支付宝交易号)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String tradeNo;

    /**
     * order_alipay_log.trade_status (交易状态)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String tradeStatus;

    /**
     * order_alipay_log.gmt_create (交易创建时间)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private Date gmtCreate;

    /**
     * order_alipay_log.gmt_payment (交易付款时间)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private Date gmtPayment;

    /**
     * order_alipay_log.gmt_close (交易关闭时间)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private Date gmtClose;

    /**
     * order_alipay_log.refund_status (退款状态)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String refundStatus;

    /**
     * order_alipay_log.gmt_refund (退款时间)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private Date gmtRefund;

    /**
     * order_alipay_log.seller_email (卖家支付宝账号)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String sellerEmail;

    /**
     * order_alipay_log.buyer_email (买家支付宝账号)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String buyerEmail;

    /**
     * order_alipay_log.seller_id (卖家支付宝账户号)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String sellerId;

    /**
     * order_alipay_log.buyer_id (买家支付宝账户号)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String buyerId;

    /**
     * order_alipay_log.price (商品单价)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private BigDecimal price;

    /**
     * order_alipay_log.total_fee (交易金额)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private BigDecimal totalFee;

    /**
     * order_alipay_log.quantity (购买数量)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private Integer quantity;

    /**
     * order_alipay_log.body (商品描述)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String body;

    /**
     * order_alipay_log.discount (折扣)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private BigDecimal discount;

    /**
     * order_alipay_log.is_total_fee_adjust (是否调整总价)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String isTotalFeeAdjust;

    /**
     * order_alipay_log.use_coupon (是否使用红包买家)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String useCoupon;

    /**
     * order_alipay_log.extra_common_param (公用回传参数)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String extraCommonParam;

    /**
     * order_alipay_log.business_scene (是否扫码支付)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String businessScene;

    /**
     * order_alipay_log.interface_type (接口类型)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String interfaceType;

    /**
     * order_alipay_log.refund_no (自定义退款订单号)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private String refundNo;

    /**
     * order_alipay_log.refund_fee (退款金额)
     * @ibatorgenerated 2018-10-09 15:56:33
     */
    private BigDecimal refundFee;

    public String getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtPayment() {
        return gmtPayment;
    }

    public void setGmtPayment(Date gmtPayment) {
        this.gmtPayment = gmtPayment;
    }

    public Date getGmtClose() {
        return gmtClose;
    }

    public void setGmtClose(Date gmtClose) {
        this.gmtClose = gmtClose;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Date getGmtRefund() {
        return gmtRefund;
    }

    public void setGmtRefund(Date gmtRefund) {
        this.gmtRefund = gmtRefund;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getIsTotalFeeAdjust() {
        return isTotalFeeAdjust;
    }

    public void setIsTotalFeeAdjust(String isTotalFeeAdjust) {
        this.isTotalFeeAdjust = isTotalFeeAdjust;
    }

    public String getUseCoupon() {
        return useCoupon;
    }

    public void setUseCoupon(String useCoupon) {
        this.useCoupon = useCoupon;
    }

    public String getExtraCommonParam() {
        return extraCommonParam;
    }

    public void setExtraCommonParam(String extraCommonParam) {
        this.extraCommonParam = extraCommonParam;
    }

    public String getBusinessScene() {
        return businessScene;
    }

    public void setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public BigDecimal getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(BigDecimal refundFee) {
        this.refundFee = refundFee;
    }
}