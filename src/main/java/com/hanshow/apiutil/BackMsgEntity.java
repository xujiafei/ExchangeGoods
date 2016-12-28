package com.hanshow.apiutil;

import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders={"status","info","data"})
public class BackMsgEntity {
	private String status;
	private String info;
	private Object data;
	
	public BackMsgEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public BackMsgEntity(String status,String info,Object data) {
		this.status = status;
		this.info = info;
		this.data = data;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
