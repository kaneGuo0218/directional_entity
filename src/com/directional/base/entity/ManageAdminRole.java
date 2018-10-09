package com.directional.base.entity;

import java.io.Serializable;

public class ManageAdminRole implements Serializable {
    /**
     * manage_admin_role.manage_admin_role_id (后台管理角色表ID)
     * @ibatorgenerated 2018-10-09 15:56:48
     */
    private Long manageAdminRoleId;

    /**
     * manage_admin_role.manage_admin_user_id (创建该角色的后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:48
     */
    private Long manageAdminUserId;

    /**
     * manage_admin_role.role_name (角色名称)
     * @ibatorgenerated 2018-10-09 15:56:48
     */
    private String roleName;

    /**
     * manage_admin_role.admin_group_id (组ID)
     * @ibatorgenerated 2018-10-09 15:56:48
     */
    private Integer adminGroupId;

    public Long getManageAdminRoleId() {
        return manageAdminRoleId;
    }

    public void setManageAdminRoleId(Long manageAdminRoleId) {
        this.manageAdminRoleId = manageAdminRoleId;
    }

    public Long getManageAdminUserId() {
        return manageAdminUserId;
    }

    public void setManageAdminUserId(Long manageAdminUserId) {
        this.manageAdminUserId = manageAdminUserId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getAdminGroupId() {
        return adminGroupId;
    }

    public void setAdminGroupId(Integer adminGroupId) {
        this.adminGroupId = adminGroupId;
    }
}