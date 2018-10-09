package com.directional.base.entity;

import java.io.Serializable;

public class ManageAdminRoleAuthority implements Serializable {
    /**
     * manage_admin_role_authority.manage_admin_role_authority_id (角色权限表ID)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Long manageAdminRoleAuthorityId;

    /**
     * manage_admin_role_authority.manage_admin_role_id (后台管理角色表ID)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Long manageAdminRoleId;

    /**
     * manage_admin_role_authority.manage_admin_authority_id (后台权限管理表ID)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Long manageAdminAuthorityId;

    /**
     * manage_admin_role_authority.is_update (是否可以改删数据)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Integer isUpdate;

    public Long getManageAdminRoleAuthorityId() {
        return manageAdminRoleAuthorityId;
    }

    public void setManageAdminRoleAuthorityId(Long manageAdminRoleAuthorityId) {
        this.manageAdminRoleAuthorityId = manageAdminRoleAuthorityId;
    }

    public Long getManageAdminRoleId() {
        return manageAdminRoleId;
    }

    public void setManageAdminRoleId(Long manageAdminRoleId) {
        this.manageAdminRoleId = manageAdminRoleId;
    }

    public Long getManageAdminAuthorityId() {
        return manageAdminAuthorityId;
    }

    public void setManageAdminAuthorityId(Long manageAdminAuthorityId) {
        this.manageAdminAuthorityId = manageAdminAuthorityId;
    }

    public Integer getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }
}