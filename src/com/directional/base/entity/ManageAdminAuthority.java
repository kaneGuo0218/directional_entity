package com.directional.base.entity;

import java.io.Serializable;

public class ManageAdminAuthority implements Serializable {
    /**
     * manage_admin_authority.manage_admin_authority_id (后台权限管理表ID)
     * @ibatorgenerated 2018-10-09 15:56:32
     */
    private Long manageAdminAuthorityId;

    /**
     * manage_admin_authority.authority_url (权限地址)
     * @ibatorgenerated 2018-10-09 15:56:32
     */
    private String authorityUrl;

    /**
     * manage_admin_authority.authority_name (权限名称)
     * @ibatorgenerated 2018-10-09 15:56:32
     */
    private String authorityName;

    /**
     * manage_admin_authority.parent_authority_id (父地址ID)
     * @ibatorgenerated 2018-10-09 15:56:32
     */
    private Long parentAuthorityId;

    /**
     * manage_admin_authority.sort (排序 数字越小越靠上)
     * @ibatorgenerated 2018-10-09 15:56:32
     */
    private Integer sort;

    /**
     * manage_admin_authority.is_show (是否显示 0：否 1：是)
     * @ibatorgenerated 2018-10-09 15:56:32
     */
    private Integer isShow;

    /**
     * manage_admin_authority.show_type (显示方式  1：纵向 2：横向)
     * @ibatorgenerated 2018-10-09 15:56:32
     */
    private Integer showType;

    public Long getManageAdminAuthorityId() {
        return manageAdminAuthorityId;
    }

    public void setManageAdminAuthorityId(Long manageAdminAuthorityId) {
        this.manageAdminAuthorityId = manageAdminAuthorityId;
    }

    public String getAuthorityUrl() {
        return authorityUrl;
    }

    public void setAuthorityUrl(String authorityUrl) {
        this.authorityUrl = authorityUrl;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public Long getParentAuthorityId() {
        return parentAuthorityId;
    }

    public void setParentAuthorityId(Long parentAuthorityId) {
        this.parentAuthorityId = parentAuthorityId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }
}