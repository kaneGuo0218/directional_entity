package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class UserComplaintContent implements Serializable {
    /**
     * user_complaint_content.user_complaint_content_id (用户投诉处理内容ID)
     * @ibatorgenerated 2018-10-09 15:56:54
     */
    private Long userComplaintContentId;

    /**
     * user_complaint_content.user_complaint_id (用户投诉表ID)
     * @ibatorgenerated 2018-10-09 15:56:54
     */
    private Long userComplaintId;

    /**
     * user_complaint_content.manage_admin_user_id (后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:54
     */
    private Long manageAdminUserId;

    /**
     * user_complaint_content.order_info_id (订单ID)
     * @ibatorgenerated 2018-10-09 15:56:54
     */
    private String orderInfoId;

    /**
     * user_complaint_content.complaint_content (沟通结果)
     * @ibatorgenerated 2018-10-09 15:56:54
     */
    private String complaintContent;

    /**
     * user_complaint_content.create_time (入库时间)
     * @ibatorgenerated 2018-10-09 15:56:54
     */
    private Date createTime;

    public Long getUserComplaintContentId() {
        return userComplaintContentId;
    }

    public void setUserComplaintContentId(Long userComplaintContentId) {
        this.userComplaintContentId = userComplaintContentId;
    }

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

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}