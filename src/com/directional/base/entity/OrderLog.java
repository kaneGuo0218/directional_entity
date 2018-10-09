package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderLog implements Serializable {
    /**
     * order_log.order_log_id (订单日志表ID)
     * @ibatorgenerated 2018-10-09 15:56:57
     */
    private Long orderLogId;

    /**
     * order_log.manage_admin_user_id (后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:57
     */
    private Long manageAdminUserId;

    /**
     * order_log.order_info_id (订单号)
     * @ibatorgenerated 2018-10-09 15:56:57
     */
    private String orderInfoId;

    /**
     * order_log.user_mobile (用户手机号)
     * @ibatorgenerated 2018-10-09 15:56:57
     */
    private String userMobile;

    /**
     * order_log.operate_type (操作类型 1：订购  2：用户退订 3：用户投诉  4：投诉待沟通  5：投诉已处理 6：退款申请 7：申请退款成功 8：退款申请取消)
     * @ibatorgenerated 2018-10-09 15:56:57
     */
    private Integer operateType;

    /**
     * order_log.operate_fee (发生金额)
     * @ibatorgenerated 2018-10-09 15:56:57
     */
    private BigDecimal operateFee;

    /**
     * order_log.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:57
     */
    private Date createTime;

    /**
     * order_log.log_desc (说明)
     * @ibatorgenerated 2018-10-09 15:56:57
     */
    private String logDesc;

    public Long getOrderLogId() {
        return orderLogId;
    }

    public void setOrderLogId(Long orderLogId) {
        this.orderLogId = orderLogId;
    }

    public Long getManageAdminUserId() {
        return manageAdminUserId;
    }

    public void setManageAdminUserId(Long manageAdminUserId) {
        this.manageAdminUserId = manageAdminUserId;
    }

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

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public BigDecimal getOperateFee() {
        return operateFee;
    }

    public void setOperateFee(BigDecimal operateFee) {
        this.operateFee = operateFee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLogDesc() {
        return logDesc;
    }

    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
    }
}