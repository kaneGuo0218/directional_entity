package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfoFlowLog implements Serializable {
    /**
     * user_info_flow_log.user_info_flow_log_id (流量使用表ID)
     * @ibatorgenerated 2018-10-09 15:56:34
     */
    private Long userInfoFlowLogId;

    /**
     * user_info_flow_log.order_info_id (订单号)
     * @ibatorgenerated 2018-10-09 15:56:34
     */
    private String orderInfoId;

    /**
     * user_info_flow_log.channel_product_code_id (渠道产品代码表ID)
     * @ibatorgenerated 2018-10-09 15:56:34
     */
    private Long channelProductCodeId;

    /**
     * user_info_flow_log.user_mobile (用户手机号)
     * @ibatorgenerated 2018-10-09 15:56:34
     */
    private String userMobile;

    /**
     * user_info_flow_log.used_flow (已用流量)
     * @ibatorgenerated 2018-10-09 15:56:34
     */
    private Long usedFlow;

    /**
     * user_info_flow_log.create_time (流量使用时间)
     * @ibatorgenerated 2018-10-09 15:56:34
     */
    private Date createTime;

    /**
     * user_info_flow_log.start_time (流量计费开始时间)
     * @ibatorgenerated 2018-10-09 15:56:34
     */
    private Date startTime;

    /**
     * user_info_flow_log.end_time (流量计费截止时间)
     * @ibatorgenerated 2018-10-09 15:56:34
     */
    private Date endTime;

    public Long getUserInfoFlowLogId() {
        return userInfoFlowLogId;
    }

    public void setUserInfoFlowLogId(Long userInfoFlowLogId) {
        this.userInfoFlowLogId = userInfoFlowLogId;
    }

    public String getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public Long getChannelProductCodeId() {
        return channelProductCodeId;
    }

    public void setChannelProductCodeId(Long channelProductCodeId) {
        this.channelProductCodeId = channelProductCodeId;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Long getUsedFlow() {
        return usedFlow;
    }

    public void setUsedFlow(Long usedFlow) {
        this.usedFlow = usedFlow;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}