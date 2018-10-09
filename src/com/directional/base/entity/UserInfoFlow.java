package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfoFlow implements Serializable {
    /**
     * user_info_flow.order_info_id (订单号)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private String orderInfoId;

    /**
     * user_info_flow.used_flow (已用流量)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Long usedFlow;

    /**
     * user_info_flow.all_flow (总流量)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Long allFlow;

    /**
     * user_info_flow.channel_product_code_id (渠道产品代码表ID)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Long channelProductCodeId;

    /**
     * user_info_flow.user_mobile (用户手机号)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private String userMobile;

    /**
     * user_info_flow.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Date createTime;

    public String getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public Long getUsedFlow() {
        return usedFlow;
    }

    public void setUsedFlow(Long usedFlow) {
        this.usedFlow = usedFlow;
    }

    public Long getAllFlow() {
        return allFlow;
    }

    public void setAllFlow(Long allFlow) {
        this.allFlow = allFlow;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}