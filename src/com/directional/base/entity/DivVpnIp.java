package com.directional.base.entity;

import java.io.Serializable;
import java.util.Date;

public class DivVpnIp implements Serializable {
    /**
     * div_vpn_ip.vpn_ip (vpn连接用的IP)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String vpnIp;

    /**
     * div_vpn_ip.create_time (入库时间)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Date createTime;

    public String getVpnIp() {
        return vpnIp;
    }

    public void setVpnIp(String vpnIp) {
        this.vpnIp = vpnIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}