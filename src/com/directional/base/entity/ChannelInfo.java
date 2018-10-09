package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class ChannelInfo implements Serializable {
    /**
     * channel_info.channel_info_id (渠道信息表ID)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private Long channelInfoId;

    /**
     * channel_info.manage_admin_user_id (后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private Long manageAdminUserId;

    /**
     * channel_info.dic_province_id (省ID)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private Integer dicProvinceId;

    /**
     * channel_info.channel_info_name (渠道信息名称)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private String channelInfoName;

    /**
     * channel_info.channel_info_contect_name (渠道联系人)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private String channelInfoContectName;

    /**
     * channel_info.contect_mobile (联系人手机号)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private String contectMobile;

    /**
     * channel_info.contect_email (联系人邮箱)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private String contectEmail;

    /**
     * channel_info.is_used (是否合作 0:停止合作 1：正常合作)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private Integer isUsed;

    /**
     * channel_info.is_delete (是否删除 0:不删除 1：删除)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private Integer isDelete;

    /**
     * channel_info.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:40
     */
    private Date createTime;

    public Long getChannelInfoId() {
        return channelInfoId;
    }

    public void setChannelInfoId(Long channelInfoId) {
        this.channelInfoId = channelInfoId;
    }

    public Long getManageAdminUserId() {
        return manageAdminUserId;
    }

    public void setManageAdminUserId(Long manageAdminUserId) {
        this.manageAdminUserId = manageAdminUserId;
    }

    public Integer getDicProvinceId() {
        return dicProvinceId;
    }

    public void setDicProvinceId(Integer dicProvinceId) {
        this.dicProvinceId = dicProvinceId;
    }

    public String getChannelInfoName() {
        return channelInfoName;
    }

    public void setChannelInfoName(String channelInfoName) {
        this.channelInfoName = channelInfoName;
    }

    public String getChannelInfoContectName() {
        return channelInfoContectName;
    }

    public void setChannelInfoContectName(String channelInfoContectName) {
        this.channelInfoContectName = channelInfoContectName;
    }

    public String getContectMobile() {
        return contectMobile;
    }

    public void setContectMobile(String contectMobile) {
        this.contectMobile = contectMobile;
    }

    public String getContectEmail() {
        return contectEmail;
    }

    public void setContectEmail(String contectEmail) {
        this.contectEmail = contectEmail;
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