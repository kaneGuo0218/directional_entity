package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class ChannelConfigInfo implements Serializable {
    /**
     * channel_config_info.channel_config_info_id (渠道配置表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long channelConfigInfoId;

    /**
     * channel_config_info.channel_info_id (渠道信息表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long channelInfoId;

    /**
     * channel_config_info.channel_product_code_id (渠道产品代码表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long channelProductCodeId;

    /**
     * channel_config_info.manage_admin_user_id (后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long manageAdminUserId;

    /**
     * channel_config_info.config_type_id (配置类型表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Long configTypeId;

    /**
     * channel_config_info.channel_config_content (渠道配置内容)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String channelConfigContent;

    /**
     * channel_config_info.is_used (是否使用 0：否 1：是)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer isUsed;

    /**
     * channel_config_info.is_delete (是否删除 0：否 1：是)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer isDelete;

    /**
     * channel_config_info.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date createTime;

    public Long getChannelConfigInfoId() {
        return channelConfigInfoId;
    }

    public void setChannelConfigInfoId(Long channelConfigInfoId) {
        this.channelConfigInfoId = channelConfigInfoId;
    }

    public Long getChannelInfoId() {
        return channelInfoId;
    }

    public void setChannelInfoId(Long channelInfoId) {
        this.channelInfoId = channelInfoId;
    }

    public Long getChannelProductCodeId() {
        return channelProductCodeId;
    }

    public void setChannelProductCodeId(Long channelProductCodeId) {
        this.channelProductCodeId = channelProductCodeId;
    }

    public Long getManageAdminUserId() {
        return manageAdminUserId;
    }

    public void setManageAdminUserId(Long manageAdminUserId) {
        this.manageAdminUserId = manageAdminUserId;
    }

    public Long getConfigTypeId() {
        return configTypeId;
    }

    public void setConfigTypeId(Long configTypeId) {
        this.configTypeId = configTypeId;
    }

    public String getChannelConfigContent() {
        return channelConfigContent;
    }

    public void setChannelConfigContent(String channelConfigContent) {
        this.channelConfigContent = channelConfigContent;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
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