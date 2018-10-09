package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderWechatLog implements Serializable {
    /**
     * order_wechat_log.order_info_id (订单号)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String orderInfoId;

    /**
     * order_wechat_log.openid (openid)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String openid;

    /**
     * order_wechat_log.transaction_id (微信支付订单号)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String transactionId;

    /**
     * order_wechat_log.nonce_str (随机字符串)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String nonceStr;

    /**
     * order_wechat_log.bank_type (付款银行)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String bankType;

    /**
     * order_wechat_log.sign (签名)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String sign;

    /**
     * order_wechat_log.fee_type (货币种类)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String feeType;

    /**
     * order_wechat_log.mch_id (商户号)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String mchId;

    /**
     * order_wechat_log.cash_fee (现金支付金额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer cashFee;

    /**
     * order_wechat_log.appid (公众账号ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String appid;

    /**
     * order_wechat_log.total_fee (订单金额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer totalFee;

    /**
     * order_wechat_log.trade_type (交易类型)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String tradeType;

    /**
     * order_wechat_log.attach (商家数据包)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String attach;

    /**
     * order_wechat_log.time_end (支付完成时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String timeEnd;

    /**
     * order_wechat_log.is_subscribe (是否关注公众账号 Y-关注，N-未关注)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String isSubscribe;

    /**
     * order_wechat_log.result_code (业务结果)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String resultCode;

    /**
     * order_wechat_log.return_code (返回状态码)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String returnCode;

    /**
     * order_wechat_log.create_time (入库时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date createTime;

    /**
     * order_wechat_log.access_token (access_token)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String accessToken;

    /**
     * order_wechat_log.refresh_token (refresh_token)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String refreshToken;

    /**
     * order_wechat_log.expires_in (token有效期)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String expiresIn;

    /**
     * order_wechat_log.scope (scope)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String scope;

    /**
     * order_wechat_log.unionid (unionid)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String unionid;

    /**
     * order_wechat_log.last_commit_orderid (最后提交订单ID  微信公众号要求每次提交的ID不一样才行)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String lastCommitOrderid;

    /**
     * order_wechat_log.refund_id (微信退款单号)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String refundId;

    /**
     * order_wechat_log.out_refund_no (商户退款单号)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String outRefundNo;

    /**
     * order_wechat_log.refund_fee (退款金额)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer refundFee;

    public String getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public Integer getCashFee() {
        return cashFee;
    }

    public void setCashFee(Integer cashFee) {
        this.cashFee = cashFee;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getLastCommitOrderid() {
        return lastCommitOrderid;
    }

    public void setLastCommitOrderid(String lastCommitOrderid) {
        this.lastCommitOrderid = lastCommitOrderid;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public Integer getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }
}