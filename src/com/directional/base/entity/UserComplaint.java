package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class UserComplaint implements Serializable {
    /**
     * user_complaint.user_complaint_id (用户投诉表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long userComplaintId;

    /**
     * user_complaint.manage_admin_user_id (后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long manageAdminUserId;

    /**
     * user_complaint.order_info_id (订单号)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String orderInfoId;

    /**
     * user_complaint.config_type_id (配置类型表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long configTypeId;

    /**
     * user_complaint.channel_product_code_id (渠道产品代码表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long channelProductCodeId;

    /**
     * user_complaint.channel_info_id (渠道信息表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long channelInfoId;

    /**
     * user_complaint.complaint_state (投诉状态（废弃）)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer complaintState;

    /**
     * user_complaint.complaint_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date complaintTime;

    /**
     * user_complaint.deal_time (最后一次处理时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date dealTime;

    /**
     * user_complaint.user_mobile (投诉用户手机号)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String userMobile;

    /**
     * user_complaint.user_province (省份)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String userProvince;

    /**
     * user_complaint.complaint_deal_state (投诉处理操作状态 1：沟通中  2：已处理  3：退款成功)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer complaintDealState;

    /**
     * user_complaint.complaint_content (投诉内容)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String complaintContent;

    /**
     * user_complaint.complaint_search (搜索内容)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String complaintSearch;

    public Long getUserComplaintId() {
        return userComplaintId;
    }

    public void setUserComplaintId(Long userComplaintId) {
        this.userComplaintId = userComplaintId;
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

    public Long getConfigTypeId() {
        return configTypeId;
    }

    public void setConfigTypeId(Long configTypeId) {
        this.configTypeId = configTypeId;
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

    public Integer getComplaintState() {
        return complaintState;
    }

    public void setComplaintState(Integer complaintState) {
        this.complaintState = complaintState;
    }

    public Date getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(Date complaintTime) {
        this.complaintTime = complaintTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public Integer getComplaintDealState() {
        return complaintDealState;
    }

    public void setComplaintDealState(Integer complaintDealState) {
        this.complaintDealState = complaintDealState;
    }

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent;
    }

    public String getComplaintSearch() {
        return complaintSearch;
    }

    public void setComplaintSearch(String complaintSearch) {
        this.complaintSearch = complaintSearch;
    }
}