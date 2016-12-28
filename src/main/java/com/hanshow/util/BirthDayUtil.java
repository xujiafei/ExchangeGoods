package com.hanshow.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthDayUtil {
	public static Map<String,Object> getBirthDays() {
	      
		//前15天日期
        Calendar c1 = Calendar.getInstance();  
        c1.add(Calendar.DATE, -15);  
        int dayInMonth1 = c1.getActualMaximum(Calendar.DATE);//这个月有多少天
        int dayOfMonth1 = c1.get(Calendar.DAY_OF_MONTH);//这个月的第几天
        int monthOfYear1 = c1.get(Calendar.MONTH)+1;//今年的几月份
        int year1 = c1.get(Calendar.YEAR);
        
        //后15天日期
        Calendar c2 = Calendar.getInstance();  
        c2.add(Calendar.DATE, 15);  
        int dayOfMonth2 = c2.get(Calendar.DAY_OF_MONTH);//这个月的第几天
        int monthOfYear2 = c2.get(Calendar.MONTH)+1;//今年的几月份
        int year2 = c2.get(Calendar.YEAR);
        
        //今天日期
        Calendar c3 = Calendar.getInstance();  
        int dayOfMonth3 = c3.get(Calendar.DAY_OF_MONTH);//这个月的第几天
        int monthOfYear3 = c3.get(Calendar.MONTH)+1;//今年的几月份
        
        Integer bMonth = monthOfYear1;
        Integer eMonth = monthOfYear2;
        Integer mMonth = null;
        List<Integer> bDays= new ArrayList<>();
        List<Integer> eDays = new ArrayList<>();
        
        if(year1==year2){        //在同一年里
        	if(monthOfYear1==monthOfYear2){//开始日期和结束日期在一个月
            	for(int i=dayOfMonth1;i<=dayOfMonth3;i++){
            		bDays.add(i);
            	}
            	for(int i=dayOfMonth3+1;i<=dayOfMonth2;i++){
            		eDays.add(i);
            	}
            }else if(monthOfYear2-monthOfYear1==1){//相连的两个月份
            	for(int i=dayOfMonth1;i<=dayInMonth1;i++){
            		bDays.add(i);
            	}
            	for(int i=1;i<=dayOfMonth2;i++){
            		eDays.add(i);
            	}
            }else if(monthOfYear2-monthOfYear1==2){//夸两个月  非闰年的2月份会有这种情况
            	mMonth = monthOfYear3;
            	for(int i=dayOfMonth1;i<=dayInMonth1;i++){
            		bDays.add(i);
            	}
            	for(int i=1;i<=dayOfMonth2;i++){
            		eDays.add(i);
            	}
            }
        }else{//跨一年,向前跨一年和向后跨一年一样的
        	for(int i=dayOfMonth1;i<=dayInMonth1;i++){
        		bDays.add(i);
        	}
        	for(int i=1;i<=dayOfMonth2;i++){
        		eDays.add(i);
        	}
        }
        
        Map<String,Object> map = new HashMap<>();
        map.put("bMonth", bMonth);
        map.put("eMonth", eMonth);
        map.put("mMonth", mMonth);
        map.put("bDays", bDays);
        map.put("eDays", eDays);
        
        return map;
	}
}
