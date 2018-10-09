package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class ManageAdminUser implements Serializable {
    /**
     * manage_admin_user.manage_admin_user_id (后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private Long manageAdminUserId;

    /**
     * manage_admin_user.admin_user_name (管理员用户名)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private String adminUserName;

    /**
     * manage_admin_user.admin_user_pwd (管理员密码)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private String adminUserPwd;

    /**
     * manage_admin_user.parent_admin_user_id (父管理员)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private Long parentAdminUserId;

    /**
     * manage_admin_user.admin_user_email (管理员邮箱)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private String adminUserEmail;

    /**
     * manage_admin_user.admin_user_mobile (管理员手机号码)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private String adminUserMobile;

    /**
     * manage_admin_user.is_prohibit (是否禁止 0：否 1：是)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private Integer isProhibit;

    /**
     * manage_admin_user.is_delete (是否删除 0：否 1：是)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private Integer isDelete;

    /**
     * manage_admin_user.admin_group_id (组ID)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private Integer adminGroupId;

    /**
     * manage_admin_user.company_name (公司名称)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private String companyName;

    /**
     * manage_admin_user.create_time (入库时间)
     * @ibatorgenerated 2018-10-09 15:56:42
     */
    private Date createTime;

    public Long getManageAdminUserId() {
        return manageAdminUserId;
    }

    public void setManageAdminUserId(Long manageAdminUserId) {
        this.manageAdminUserId = manageAdminUserId;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminUserPwd() {
        return adminUserPwd;
    }

    public void setAdminUserPwd(String adminUserPwd) {
        this.adminUserPwd = adminUserPwd;
    }

    public Long getParentAdminUserId() {
        return parentAdminUserId;
    }

    public void setParentAdminUserId(Long parentAdminUserId) {
        this.parentAdminUserId = parentAdminUserId;
    }

    public String getAdminUserEmail() {
        return adminUserEmail;
    }

    public void setAdminUserEmail(String adminUserEmail) {
        this.adminUserEmail = adminUserEmail;
    }

    public String getAdminUserMobile() {
        return adminUserMobile;
    }

    public void setAdminUserMobile(String adminUserMobile) {
        this.adminUserMobile = adminUserMobile;
    }

    public Integer getIsProhibit() {
        return isProhibit;
    }

    public void setIsProhibit(Integer isProhibit) {
        this.isProhibit = isProhibit;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getAdminGroupId() {
        return adminGroupId;
    }

    public void setAdminGroupId(Integer adminGroupId) {
        this.adminGroupId = adminGroupId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}