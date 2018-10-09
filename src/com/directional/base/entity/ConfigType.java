package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class ConfigType implements Serializable {
    /**
     * config_type.config_type_id (配置类型表ID)
     * @ibatorgenerated 2018-10-09 15:56:50
     */
    private Long configTypeId;

    /**
     * config_type.manage_admin_user_id (后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:50
     */
    private Long manageAdminUserId;

    /**
     * config_type.config_type_name (配置类型表名称)
     * @ibatorgenerated 2018-10-09 15:56:50
     */
    private String configTypeName;

    /**
     * config_type.config_state (类型状态  0:停止使用  1：使用)
     * @ibatorgenerated 2018-10-09 15:56:50
     */
    private Integer configState;

    /**
     * config_type.is_delete (是否删除 0：否 1：是)
     * @ibatorgenerated 2018-10-09 15:56:50
     */
    private Integer isDelete;

    /**
     * config_type.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:50
     */
    private Date createTime;

    public Long getConfigTypeId() {
        return configTypeId;
    }

    public void setConfigTypeId(Long configTypeId) {
        this.configTypeId = configTypeId;
    }

    public Long getManageAdminUserId() {
        return manageAdminUserId;
    }

    public void setManageAdminUserId(Long manageAdminUserId) {
        this.manageAdminUserId = manageAdminUserId;
    }

    public String getConfigTypeName() {
        return configTypeName;
    }

    public void setConfigTypeName(String configTypeName) {
        this.configTypeName = configTypeName;
    }

    public Integer getConfigState() {
        return configState;
    }

    public void setConfigState(Integer configState) {
        this.configState = configState;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}