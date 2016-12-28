package com.hanshow.apiutil;

/**
 * @author ShaZhiDa
 * @date 2016年11月17日 上午10:27:38
 * @Description: 检查接口参数是否为空
 * @version V1.0
 */
public class CheckParams {
	public static boolean doCheck(Object[] params){
		for(Object ob : params){
			if(ob==null) return false;
		}
		return true;
	}
}
