package com.hanshow.entity;

import java.util.Date;

public class ExchangeableGoods {
    private Integer id;

    private String code;

    private String name;

    private Integer needIntegral;

    private Integer remains;

    private Date addTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNeedIntegral() {
        return needIntegral;
    }

    public void setNeedintegral(Integer needIntegral) {
        this.needIntegral = needIntegral;
    }

    public Integer getRemains() {
        return remains;
    }

    public void setRemains(Integer remains) {
        this.remains = remains;
    }

    public Date getAddtime() {
        return addTime;
    }

    public void setAddtime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdatetime() {
        return updateTime;
    }

    public void setUpdatetime(Date updateTime) {
        this.updateTime = updateTime;
    }
}