package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class CommonConfig implements Serializable {
    /**
     * common_config.config_name (配置名称)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private String configName;

    /**
     * common_config.config_content (配置内容)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private String configContent;

    /**
     * common_config.config_extra_content (配置额外信息)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private String configExtraContent;

    /**
     * common_config.config_desc (配置说明)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private String configDesc;

    /**
     * common_config.create_time (入库时间)
     * @ibatorgenerated 2018-10-09 15:56:55
     */
    private Date createTime;

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getConfigContent() {
        return configContent;
    }

    public void setConfigContent(String configContent) {
        this.configContent = configContent;
    }

    public String getConfigExtraContent() {
        return configExtraContent;
    }

    public void setConfigExtraContent(String configExtraContent) {
        this.configExtraContent = configExtraContent;
    }

    public String getConfigDesc() {
        return configDesc;
    }

    public void setConfigDesc(String configDesc) {
        this.configDesc = configDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}