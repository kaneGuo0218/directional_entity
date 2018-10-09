package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    /**
     * user_info.user_mobile (用户手机号)
     * @ibatorgenerated 2018-10-09 15:56:46
     */
    private String userMobile;

    /**
     * user_info.create_time (用户创建时间)
     * @ibatorgenerated 2018-10-09 15:56:46
     */
    private Date createTime;

    /**
     * user_info.user_pwd (用户密码)
     * @ibatorgenerated 2018-10-09 15:56:46
     */
    private String userPwd;

    /**
     * user_info.iccid (iccid)
     * @ibatorgenerated 2018-10-09 15:56:46
     */
    private String iccid;

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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }
}