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
import com.hanshow.apiutil.CheckParams;
import com.hanshow.apiutil.GetBodyParams;
import com.hanshow.apiutil.PageUtil;
import com.hanshow.entity.ExchangeableGoods;
import com.hanshow.service.ExchangeableGoodsService;

@Controller
public class ExchangeableGoodsController {
	@Autowired
	ExchangeableGoodsService exchangeableGoodsService;

	/**
	 * 分页查询可兑换商品列表
	 * @return
	 */
	@RequestMapping(value="/getExchangeableGoodsList",method = RequestMethod.GET)
	@ResponseBody
	public String selectForPage(HttpServletRequest request,Integer page,Integer limit){
		ExchangeableGoods params = GetBodyParams.toBean(request, ExchangeableGoods.class);
		String[] checkField = {"channeltype","channelcode"};
		if(!CheckFields.doCheck(checkField, params)){
			return BackJson.jsonFormat(BackStateEnum._500.getCode(), "缺少必要参数", null);
		}else{
			return BackJson.jsonFormat(exchangeableGoodsService.selectForPage(params,PageUtil.initParam(page, limit)));
		}
	}
	
	/**
	 * 添加可兑换商品
	 */
	@RequestMapping(value="/addExchangeableGoods",method=RequestMethod.POST)
	@ResponseBody
	public String insert(HttpServletRequest request){
		ExchangeableGoods params=GetBodyParams.toBean(request, ExchangeableGoods.class);
		String[] fields={"channeltype","channelcode"};
		if(!CheckFields.doCheck(fields, params)){
			return BackJson.jsonFormat(BackStateEnum._500.getCode(),"缺少必要参数",null);
		}else{
			return BackJson.jsonFormat(exchangeableGoodsService.insert(params));
		}
			
	}
	
	/**
	 * 更新可兑换商品
	 */
	@RequestMapping(value="/updateExchangeableGoods",method=RequestMethod.POST)
	@ResponseBody
	public String update(HttpServletRequest request){
		ExchangeableGoods params=GetBodyParams.toBean(request, ExchangeableGoods.class);
		String[] fields={"channeltype","channelcode"};
		if(!CheckFields.doCheck(fields, params)){
			return BackJson.jsonFormat(BackStateEnum._500.getCode(),"缺少必要参数",null);
		}else{
			return BackJson.jsonFormat(exchangeableGoodsService.update(params));
		}
			
	}
	/**
	 * 更新商品剩余数量
	 */
	@RequestMapping(value="/updateExchangeableGoodsRemains",method=RequestMethod.POST)
	@ResponseBody
	public String updateRemains(Integer id,Integer count,Integer channeltype,String channelcode){
		if(!CheckParams.doCheck(new Object[]{channeltype,channelcode})){
			return BackJson.jsonFormat(BackStateEnum._500.getCode(),"缺少必要参数",null);
		}else{
			return BackJson.jsonFormat(exchangeableGoodsService.updateRemains(id,count,channeltype,channelcode));
		}
			
	}
}
