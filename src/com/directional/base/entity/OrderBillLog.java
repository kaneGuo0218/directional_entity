package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderBillLog implements Serializable {
    /**
     * order_bill_log.order_info_id (订单号)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String orderInfoId;

    /**
     * order_bill_log.cp_fee (计费编码)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String cpFee;

    /**
     * order_bill_log.cp_goods (接入商)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String cpGoods;

    /**
     * order_bill_log.user_imei (imei)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String userImei;

    /**
     * order_bill_log.user_imsi (imsi)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String userImsi;

    /**
     * order_bill_log.user_type (运营商  1：移动 2：联通 3：电信)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private Integer userType;

    /**
     * order_bill_log.user_mobile (手机号码)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String userMobile;

    /**
     * order_bill_log.exeno (计费次数  默认0)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String exeno;

    /**
     * order_bill_log.customer_id (用户唯一标识)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String customerId;

    /**
     * order_bill_log.sdk_version (sdk版本号 默认：1.0.1)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String sdkVersion;

    /**
     * order_bill_log.create_time (入库时间)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private Date createTime;

    /**
     * order_bill_log.task_id (唯一订单号)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String taskId;

    /**
     * order_bill_log.org_addr (联通分配的上行端口号，资费不同端口号也不同)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String orgAddr;

    /**
     * order_bill_log.cmd (联通分配的订购指令)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String cmd;

    /**
     * order_bill_log.hret (订购状态 0：订购成功；1：订购失败；2：退订成功；3：退订失败)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private Integer hret;

    /**
     * order_bill_log.pay_fee (计费金额 单位分)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private BigDecimal payFee;

    /**
     * order_bill_log.order_time (操作时间)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String orderTime;

    /**
     * order_bill_log.type (数据类型 固定值为RELATION)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String type;

    /**
     * order_bill_log.sign (签名  加密参数)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String sign;

    /**
     * order_bill_log.extr_json (其他信息 json格式)
     * @ibatorgenerated 2018-10-09 15:56:49
     */
    private String extrJson;

    public String getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public String getCpFee() {
        return cpFee;
    }

    public void setCpFee(String cpFee) {
        this.cpFee = cpFee;
    }

    public String getCpGoods() {
        return cpGoods;
    }

    public void setCpGoods(String cpGoods) {
        this.cpGoods = cpGoods;
    }

    public String getUserImei() {
        return userImei;
    }

    public void setUserImei(String userImei) {
        this.userImei = userImei;
    }

    public String getUserImsi() {
        return userImsi;
    }

    public void setUserImsi(String userImsi) {
        this.userImsi = userImsi;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getExeno() {
        return exeno;
    }

    public void setExeno(String exeno) {
        this.exeno = exeno;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getOrgAddr() {
        return orgAddr;
    }

    public void setOrgAddr(String orgAddr) {
        this.orgAddr = orgAddr;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public Integer getHret() {
        return hret;
    }

    public void setHret(Integer hret) {
        this.hret = hret;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getExtrJson() {
        return extrJson;
    }

    public void setExtrJson(String extrJson) {
        this.extrJson = extrJson;
    }
}