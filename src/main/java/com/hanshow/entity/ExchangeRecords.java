package com.hanshow.entity;

import java.util.Date;

public class ExchangeRecords {
	private Integer id;

	private Integer memberId;

	private Integer goodsId;

	private Integer exchangeCount;

	private Integer expenseIntegral;

	private Integer adduserId;

	private Date addTime;

	private Date updateTime;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getExchangeCount() {
		return exchangeCount;
	}

	public void setExchangeCount(Integer exchangeCount) {
		this.exchangeCount = exchangeCount;
	}

	public Integer getExpenseIntegral() {
		return expenseIntegral;
	}

	public void setExpenseIntegral(Integer expenseIntegral) {
		this.expenseIntegral = expenseIntegral;
	}

	public Integer getAdduserId() {
		return adduserId;
	}

	public void setAdduserId(Integer adduserId) {
		this.adduserId = adduserId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}