package com.directional.base.entity;

public class OrderWechatLogWithBLOBs extends OrderWechatLog {
    /**
     * order_wechat_log.order_json (订单json)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String orderJson;

    /**
     * order_wechat_log.refund_json (退款json)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String refundJson;

    public String getOrderJson() {
        return orderJson;
    }

    public void setOrderJson(String orderJson) {
        this.orderJson = orderJson;
    }

    public String getRefundJson() {
        return refundJson;
    }

    public void setRefundJson(String refundJson) {
        this.refundJson = refundJson;
    }
}