package com.hanshow.apiutil;

import com.alibaba.fastjson.JSON;

public class BackJson {
	public static String jsonFormat(String state,String info,Object data){
		BackMsgEntity entity = new BackMsgEntity();
		entity.setStatus(state);
		entity.setInfo(info);;
		entity.setData(data);
		return JSON.toJSONString(entity);
	}
	
	public static String jsonFormat(BackMsgEntity entity){
		return JSON.toJSONString(entity);
	}
}
