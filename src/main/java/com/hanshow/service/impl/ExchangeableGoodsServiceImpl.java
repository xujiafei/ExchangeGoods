package com.hanshow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.hanshow.apiutil.BackMsgEntity;
import com.hanshow.apiutil.BackStateEnum;
import com.hanshow.entity.ExchangeableGoods;
import com.hanshow.mapper.ExchangeableGoodsMapper;
import com.hanshow.service.ExchangeableGoodsService;

@Service
public class ExchangeableGoodsServiceImpl implements ExchangeableGoodsService {

	@Autowired
	ExchangeableGoodsMapper exchangeableGoodsMapper;
	@Override
	public BackMsgEntity selectForPage(ExchangeableGoods goods,PageBounds pageBounds) {
		List<ExchangeableGoods> list = exchangeableGoodsMapper.selectForPage(goods,pageBounds);
		if(list==null||list.size()==0){
			return new BackMsgEntity(BackStateEnum._404.getCode(), "没有可兑换商品", null);
		}else{
			return new BackMsgEntity(BackStateEnum._200.getCode(), "查询成功", list);
		}
	}
	@Override
	public BackMsgEntity insert(ExchangeableGoods goods) {
		if(exchangeableGoodsMapper.insert(goods)>0){
			return new BackMsgEntity(BackStateEnum._200.getCode(), "添加成功",null);
		}else{
			return new BackMsgEntity(BackStateEnum._500.getCode(), "添加失败", null);
		}
	}
	@Override
	public BackMsgEntity update(ExchangeableGoods goods) {
		if(exchangeableGoodsMapper.update(goods)>0){
			return new BackMsgEntity(BackStateEnum._200.getCode(), "更新成功",null);
		}else{
			return new BackMsgEntity(BackStateEnum._500.getCode(), "更新失败", null);
		}
	}
	@Override
	public BackMsgEntity updateRemains(Integer id,Integer count,Integer channeltype,String channelcode) {
		if(exchangeableGoodsMapper.updateRemains(id,count,channeltype,channelcode)>0){
			return new BackMsgEntity(BackStateEnum._200.getCode(), "更新成功",null);
		}else{
			return new BackMsgEntity(BackStateEnum._500.getCode(), "更新失败", null);
		}
	}
}
