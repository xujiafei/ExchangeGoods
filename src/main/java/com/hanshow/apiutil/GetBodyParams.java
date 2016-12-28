package com.hanshow.apiutil;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;

/**
 * @author ShaZhiDa
 * @date 2016年11月17日 下午3:41:14
 * @Description: 获取http body中的参数
 * @version V1.0
 */
public class GetBodyParams {
	public static <T> T toBean(HttpServletRequest request,Class<T> cls){
		T t = null;
		String finalStr = "";
		
		BufferedReader br;
		try {
			br = request.getReader();
			String str= "";
			while((str = br.readLine()) != null){
				finalStr += str;
			}
		} catch (IOException e) {
			return t;
		}
		
		try {
			t = JSON.parseObject(finalStr, cls);
		} catch (Exception e) {
			return t;
		}
		return t;
	}
}
