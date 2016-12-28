package com.hanshow.apiutil;

public enum BackStateEnum {
	_200("200"),
	_404("404"),
	_500("500");
	
	private String stateName;
	private BackStateEnum(String stateName) {
		this.stateName = stateName;
	}
	
	public String getCode(){
		return this.stateName;
	}
}
