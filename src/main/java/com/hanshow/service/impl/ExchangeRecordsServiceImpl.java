package com.hanshow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.hanshow.apiutil.BackMsgEntity;
import com.hanshow.apiutil.BackStateEnum;
import com.hanshow.entity.ExchangeRecords;
import com.hanshow.mapper.ExchangeRecordsMapper;
import com.hanshow.service.ExchangeRecordsService;

@Service
public class ExchangeRecordsServiceImpl implements ExchangeRecordsService {

	@Autowired
	ExchangeRecordsMapper exchangeRecordsMapper;
	@Override
	public BackMsgEntity selectForPage(ExchangeRecords records,PageBounds pageBounds) {
		List<ExchangeRecords> list = exchangeRecordsMapper.selectForPage(records,pageBounds);
		if(list==null||list.size()==0){
			return new BackMsgEntity(BackStateEnum._404.getCode(), "没有可兑换商品", null);
		}else{
			return new BackMsgEntity(BackStateEnum._200.getCode(), "查询成功", list);
		}
	}
	@Override
	public BackMsgEntity insert(ExchangeRecords records) {
		if(exchangeRecordsMapper.insert(records)>0){
			return new BackMsgEntity(BackStateEnum._200.getCode(), "添加成功",null);
		}else{
			return new BackMsgEntity(BackStateEnum._500.getCode(), "添加失败", null);
		}
	}

}
