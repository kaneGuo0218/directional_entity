package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class UserFeedback implements Serializable {
    /**
     * user_feedback.user_feedback_id (用户信息反馈表ID)
     * @ibatorgenerated 2018-10-09 15:56:53
     */
    private Long userFeedbackId;

    /**
     * user_feedback.contect (联系方式)
     * @ibatorgenerated 2018-10-09 15:56:53
     */
    private String contect;

    /**
     * user_feedback.content (反馈内容)
     * @ibatorgenerated 2018-10-09 15:56:53
     */
    private String content;

    /**
     * user_feedback.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:53
     */
    private Date createTime;

    public Long getUserFeedbackId() {
        return userFeedbackId;
    }

    public void setUserFeedbackId(Long userFeedbackId) {
        this.userFeedbackId = userFeedbackId;
    }

    public String getContect() {
        return contect;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}