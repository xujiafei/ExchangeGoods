package com.hanshow.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ShaZhiDa
 * @date 2016年11月28日 下午3:21:57
 * @Description: mybaits 查询 list转map（mybaits直接转map key为空时会有问题）
 * @version V1.0
 */
public class ListToMap {
	@SuppressWarnings("unchecked")
	public static <T> Map<Integer,T> list2Map(String keyName,List<T> list){
		Map<Integer,T> backMap = null;
		Class<?> clazz = null;
		if(null !=list){
			keyName = keyName.substring(0, 1).toUpperCase() + keyName.substring(1);
			keyName ="get"+keyName;
			for(Object cur:list){
				if(null == cur) continue;
				if(null == backMap) backMap = new HashMap<>();
				
				try {
					clazz = Class.forName(cur.getClass().getName());
					
			        Method m = clazz.getDeclaredMethod(keyName);
			        Object o =  m.invoke(cur); 
					
					if(o!=null){
						Integer key = (Integer) o;
						backMap.put(key,  (T) cur);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		return backMap;
	}
}
