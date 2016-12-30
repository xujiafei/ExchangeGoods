package com.hanshow.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanshow.apiutil.BackJson;
import com.hanshow.apiutil.BackStateEnum;
import com.hanshow.apiutil.CheckFields;
import com.hanshow.apiutil.GetBodyParams;
import com.hanshow.apiutil.PageUtil;
import com.hanshow.entity.ExchangeRecords;
import com.hanshow.service.ExchangeRecordsService;

@Controller
public class ExchangeRecordsController {
	@Autowired
	ExchangeRecordsService exchangeRecordsService;

	/**
	 * 分页查询兑换记录
	 * @return
	 */
	@RequestMapping(value="/getExchangeRecordsList",method = RequestMethod.GET)
	@ResponseBody
	public String selectForPage(ExchangeRecords params,Integer page,Integer limit){
		String[] checkField = {"channelType","channelCode"};
		if(!CheckFields.doCheck(checkField, params)){
			return BackJson.jsonFormat(BackStateEnum._500.getCode(), "缺少必要参数", null);
		}else{
			return BackJson.jsonFormat(exchangeRecordsService.selectForPage(params,PageUtil.initParam(page, limit)));
		}
	}
	
	/**
	 * 添加兑换记录
	 */
	@RequestMapping(value="/addExchangeRecords",method=RequestMethod.POST)
	@ResponseBody
	public String insert(HttpServletRequest request){
		ExchangeRecords params=GetBodyParams.toBean(request, ExchangeRecords.class);
		String[] fields={"channelType","channelCode"};
		if(!CheckFields.doCheck(fields, params)){
			return BackJson.jsonFormat(BackStateEnum._500.getCode(),"缺少必要参数",null);
		}else{
			return BackJson.jsonFormat(exchangeRecordsService.insert(params));
		}
			
	}
	

}
