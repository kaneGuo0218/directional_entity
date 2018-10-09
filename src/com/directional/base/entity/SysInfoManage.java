package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class SysInfoManage implements Serializable {
    /**
     * sys_info_manage.sys_info_manage_id (信息管理表ID)
     * @ibatorgenerated 2018-10-09 15:56:39
     */
    private Long sysInfoManageId;

    /**
     * sys_info_manage.info_type (说明类型)
     * @ibatorgenerated 2018-10-09 15:56:39
     */
    private Integer infoType;

    /**
     * sys_info_manage.info_url (说明用的H5页面URL)
     * @ibatorgenerated 2018-10-09 15:56:39
     */
    private String infoUrl;

    /**
     * sys_info_manage.info_desc (说明)
     * @ibatorgenerated 2018-10-09 15:56:39
     */
    private String infoDesc;

    /**
     * sys_info_manage.create_time (入库时间)
     * @ibatorgenerated 2018-10-09 15:56:39
     */
    private Date createTime;

    public Long getSysInfoManageId() {
        return sysInfoManageId;
    }

    public void setSysInfoManageId(Long sysInfoManageId) {
        this.sysInfoManageId = sysInfoManageId;
    }

    public Integer getInfoType() {
        return infoType;
    }

    public void setInfoType(Integer infoType) {
        this.infoType = infoType;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public String getInfoDesc() {
        return infoDesc;
    }

    public void setInfoDesc(String infoDesc) {
        this.infoDesc = infoDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}