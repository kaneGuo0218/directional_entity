package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ChannelProductCode implements Serializable {
    /**
     * channel_product_code.channel_product_code_id (渠道产品代码表ID)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private Long channelProductCodeId;

    /**
     * channel_product_code.channel_info_id (渠道信息表ID)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private Long channelInfoId;

    /**
     * channel_product_code.config_type_id (配置类型表ID)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private Long configTypeId;

    /**
     * channel_product_code.manage_admin_user_id (后台管理用户ID)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private Long manageAdminUserId;

    /**
     * channel_product_code.code_content (产品名称)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private String codeContent;

    /**
     * channel_product_code.is_delete (是否删除 0：否 1：是)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private Integer isDelete;

    /**
     * channel_product_code.product_sort (排序)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private Integer productSort;

    /**
     * channel_product_code.product_price (产品价格)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private BigDecimal productPrice;

    /**
     * channel_product_code.fee_type (计费类型 1：自然月 2：自定义)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private Integer feeType;

    /**
     * channel_product_code.fee_days (计费时长)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private Integer feeDays;

    /**
     * channel_product_code.product_flow (产品流量)
     * @ibatorgenerated 2018-10-09 15:56:35
     */
    private Long productFlow;

    /**
     * channel_product_code.product_ad_desc (产品宣传语)
     * @ibatorgenerated 2018-10-09 15:56:36
     */
    private String productAdDesc;

    /**
     * channel_product_code.create_time (创建时间)
     * @ibatorgenerated 2018-10-09 15:56:36
     */
    private Date createTime;

    /**
     * channel_product_code.product_code (产品代码)
     * @ibatorgenerated 2018-10-09 15:56:36
     */
    private String productCode;

    public Long getChannelProductCodeId() {
        return channelProductCodeId;
    }

    public void setChannelProductCodeId(Long channelProductCodeId) {
        this.channelProductCodeId = channelProductCodeId;
    }

    public Long getChannelInfoId() {
        return channelInfoId;
    }

    public void setChannelInfoId(Long channelInfoId) {
        this.channelInfoId = channelInfoId;
    }

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

    public String getCodeContent() {
        return codeContent;
    }

    public void setCodeContent(String codeContent) {
        this.codeContent = codeContent;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getProductSort() {
        return productSort;
    }

    public void setProductSort(Integer productSort) {
        this.productSort = productSort;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getFeeType() {
        return feeType;
    }

    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }

    public Integer getFeeDays() {
        return feeDays;
    }

    public void setFeeDays(Integer feeDays) {
        this.feeDays = feeDays;
    }

    public Long getProductFlow() {
        return productFlow;
    }

    public void setProductFlow(Long productFlow) {
        this.productFlow = productFlow;
    }

    public String getProductAdDesc() {
        return productAdDesc;
    }

    public void setProductAdDesc(String productAdDesc) {
        this.productAdDesc = productAdDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}