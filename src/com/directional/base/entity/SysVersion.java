package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class SysVersion implements Serializable {
    /**
     * sys_version.version_id (版本ID)
     * @ibatorgenerated 2018-10-09 15:56:45
     */
    private Integer versionId;

    /**
     * sys_version.version (版本号)
     * @ibatorgenerated 2018-10-09 15:56:45
     */
    private String version;

    /**
     * sys_version.sdk_url (sdk下载地址)
     * @ibatorgenerated 2018-10-09 15:56:45
     */
    private String sdkUrl;

    /**
     * sys_version.version_desc (更新说明)
     * @ibatorgenerated 2018-10-09 15:56:45
     */
    private String versionDesc;

    /**
     * sys_version.create_time (上传时间)
     * @ibatorgenerated 2018-10-09 15:56:45
     */
    private Date createTime;

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSdkUrl() {
        return sdkUrl;
    }

    public void setSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
    }

    public String getVersionDesc() {
        return versionDesc;
    }

    public void setVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}