package com.directional.base.entity;

import java.io.Serializable;

public class DicNationality implements Serializable {
    /**
     * dic_nationality.dic_nationality_id (国籍表ID)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private Integer dicNationalityId;

    /**
     * dic_nationality.nationality_name (国籍名称)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String nationalityName;

    /**
     * dic_nationality.nationality_en_name (英文名称)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String nationalityEnName;

    /**
     * dic_nationality.national_flag_url (国旗图片地址)
     * @ibatorgenerated 2018-10-09 15:56:56
     */
    private String nationalFlagUrl;

    public Integer getDicNationalityId() {
        return dicNationalityId;
    }

    public void setDicNationalityId(Integer dicNationalityId) {
        this.dicNationalityId = dicNationalityId;
    }

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }

    public String getNationalityEnName() {
        return nationalityEnName;
    }

    public void setNationalityEnName(String nationalityEnName) {
        this.nationalityEnName = nationalityEnName;
    }

    public String getNationalFlagUrl() {
        return nationalFlagUrl;
    }

    public void setNationalFlagUrl(String nationalFlagUrl) {
        this.nationalFlagUrl = nationalFlagUrl;
    }
}