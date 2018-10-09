package com.directional.base.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class DicProvince implements Serializable {
    /**
     * dic_province.dic_province_id (省ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer dicProvinceId;

    /**
     * dic_province.province_name (省份名称)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String provinceName;

    /**
     * dic_province.dic_nationality_id (国家id)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer dicNationalityId;

    /**
     * dic_province.province_lat (纬度)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private BigDecimal provinceLat;

    /**
     * dic_province.province_lng (经度)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private BigDecimal provinceLng;

    /**
     * dic_province.province_adcode
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String provinceAdcode;

    public Integer getDicProvinceId() {
        return dicProvinceId;
    }

    public void setDicProvinceId(Integer dicProvinceId) {
        this.dicProvinceId = dicProvinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getDicNationalityId() {
        return dicNationalityId;
    }

    public void setDicNationalityId(Integer dicNationalityId) {
        this.dicNationalityId = dicNationalityId;
    }

    public BigDecimal getProvinceLat() {
        return provinceLat;
    }

    public void setProvinceLat(BigDecimal provinceLat) {
        this.provinceLat = provinceLat;
    }

    public BigDecimal getProvinceLng() {
        return provinceLng;
    }

    public void setProvinceLng(BigDecimal provinceLng) {
        this.provinceLng = provinceLng;
    }

    public String getProvinceAdcode() {
        return provinceAdcode;
    }

    public void setProvinceAdcode(String provinceAdcode) {
        this.provinceAdcode = provinceAdcode;
    }
}