package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class AppList implements Serializable {
    /**
     * app_list.app_version (版本名称)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private String appVersion;

    /**
     * app_list.app_desc (版本说明)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private String appDesc;

    /**
     * app_list.app_down_url (下载地址)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private String appDownUrl;

    /**
     * app_list.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Date createTime;

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    public String getAppDownUrl() {
        return appDownUrl;
    }

    public void setAppDownUrl(String appDownUrl) {
        this.appDownUrl = appDownUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}