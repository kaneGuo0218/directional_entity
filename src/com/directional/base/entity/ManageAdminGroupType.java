package com.directional.base.entity;

import java.io.Serializable;

public class ManageAdminGroupType implements Serializable {
    /**
     * manage_admin_group_type.admin_group_id (组ID)
     * @ibatorgenerated 2018-10-09 15:56:30
     */
    private Integer adminGroupId;

    /**
     * manage_admin_group_type.admin_group_type (notuse组类型  1:用户全部可查看  2：用户独立)
     * @ibatorgenerated 2018-10-09 15:56:30
     */
    private Integer adminGroupType;

    /**
     * manage_admin_group_type.admin_appid (分配的APPID)
     * @ibatorgenerated 2018-10-09 15:56:30
     */
    private String adminAppid;

    /**
     * manage_admin_group_type.admin_appsecret (分配的appsecret)
     * @ibatorgenerated 2018-10-09 15:56:30
     */
    private String adminAppsecret;

    /**
     * manage_admin_group_type.company_name (公司名称)
     * @ibatorgenerated 2018-10-09 15:56:30
     */
    private String companyName;

    public Integer getAdminGroupId() {
        return adminGroupId;
    }

    public void setAdminGroupId(Integer adminGroupId) {
        this.adminGroupId = adminGroupId;
    }

    public Integer getAdminGroupType() {
        return adminGroupType;
    }

    public void setAdminGroupType(Integer adminGroupType) {
        this.adminGroupType = adminGroupType;
    }

    public String getAdminAppid() {
        return adminAppid;
    }

    public void setAdminAppid(String adminAppid) {
        this.adminAppid = adminAppid;
    }

    public String getAdminAppsecret() {
        return adminAppsecret;
    }

    public void setAdminAppsecret(String adminAppsecret) {
        this.adminAppsecret = adminAppsecret;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}