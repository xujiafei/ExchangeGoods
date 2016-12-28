package com.hanshow.apiutil;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @author ShaZhiDa
 * @date 2016年11月17日 下午4:18:29
 * @Description: 检查实体实行不为空
 * @version V1.0
 */
public class CheckFields {
	public static boolean doCheck(String[] fields,Object obj){
		Class<?> clazz = null;
		List<String> fieldsList = Arrays.asList(fields);
		
		try {
			clazz = Class.forName(obj.getClass().getName());
			Field[] privateArray = clazz.getDeclaredFields();
			
			for(Field field : privateArray){
				
				if(fieldsList.contains(field.getName())){
					PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
					Method rM = pd.getReadMethod();// 获得读方法
					Object o = rM.invoke(obj);
					if(o==null) return false;
				}
				
			}
		} catch (Exception e) {
			return false;
		}
		return true;
		
	}
}
