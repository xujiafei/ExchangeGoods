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
    
    private Integer channeltype;
    
    private String channelcode;
    
    private Integer storeId;
    
    private Integer minIntegral;
    
    private Integer maxIntegral;

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
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNeedIntegral() {
		return needIntegral;
	}

	public void setNeedIntegral(Integer needIntegral) {
		this.needIntegral = needIntegral;
	}

	public Integer getRemains() {
		return remains;
	}

	public void setRemains(Integer remains) {
		this.remains = remains;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getChanneltype() {
		return channeltype;
	}

	public void setChanneltype(Integer channeltype) {
		this.channeltype = channeltype;
	}

	public String getChannelcode() {
		return channelcode;
	}

	public void setChannelcode(String channelcode) {
		this.channelcode = channelcode;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getMinIntegral() {
		return minIntegral;
	}

	public void setMinIntegral(Integer minIntegral) {
		this.minIntegral = minIntegral;
	}

	public Integer getMaxIntegral() {
		return maxIntegral;
	}

	public void setMaxIntegral(Integer maxIntegral) {
		this.maxIntegral = maxIntegral;
	}

}