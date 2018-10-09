package com.directional.base.entity;

import java.io.Serializable;

public class ManageAdminUserRole implements Serializable {
    /**
     * manage_admin_user_role.manage_admin_user_role_id (用户角色对应表ID)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Long manageAdminUserRoleId;

    /**
     * manage_admin_user_role.manage_admin_user_id (后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Long manageAdminUserId;

    /**
     * manage_admin_user_role.manage_admin_role_id (后台管理角色表ID)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Long manageAdminRoleId;

    public Long getManageAdminUserRoleId() {
        return manageAdminUserRoleId;
    }

    public void setManageAdminUserRoleId(Long manageAdminUserRoleId) {
        this.manageAdminUserRoleId = manageAdminUserRoleId;
    }

    public Long getManageAdminUserId() {
        return manageAdminUserId;
    }

    public void setManageAdminUserId(Long manageAdminUserId) {
        this.manageAdminUserId = manageAdminUserId;
    }

    public Long getManageAdminRoleId() {
        return manageAdminRoleId;
    }

    public void setManageAdminRoleId(Long manageAdminRoleId) {
        this.manageAdminRoleId = manageAdminRoleId;
    }
}