package com.hanshows.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.hanshow.apiutil.BackMsgEntity;
import com.hanshow.entity.ExchangeRecords;
import com.hanshow.entity.ExchangeableGoods;
import com.hanshow.service.ExchangeRecordsService;
import com.hanshow.service.ExchangeableGoodsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestService{

	@Autowired
	private ExchangeableGoodsService exchangeableGoodsService;
	@Autowired
	private ExchangeRecordsService exchangeRecordsService;

	@Test
	public void insert(){
		ExchangeableGoods goods=new ExchangeableGoods();
		goods.setAddTime(new Date());
		goods.setCode("223543");
		goods.setName("测试商品");
		goods.setNeedIntegral(15);
		goods.setRemains(1000);
		goods.setChannelcode("2");
		goods.setChanneltype(1);
		BackMsgEntity result=exchangeableGoodsService.insert(goods);
		System.out.println(result.getStatus());
	}
	
	@Test
	public void update(){
		ExchangeableGoods goods=new ExchangeableGoods();
		goods.setId(1);
		goods.setName("edit");
		BackMsgEntity result=exchangeableGoodsService.update(goods);
		System.out.print(result.getStatus());
	}
	
	@Test
	public void updateRemains(){
		BackMsgEntity result=exchangeableGoodsService.updateRemains(1, 5, 1, "2");
		System.out.print(result.getStatus());
	}
	
	@Test
	public void delete(){
	}
	
	@Test
	public void queryForPage(){
		ExchangeableGoods goods=new ExchangeableGoods();
		PageBounds pageBounds=new PageBounds();
		pageBounds.setLimit(10);
		pageBounds.setPage(0);
		goods.setChannelcode("2");
		goods.setChanneltype(1);
		BackMsgEntity result=exchangeableGoodsService.selectForPage(goods, pageBounds);
		System.out.print(result.getStatus());
	}
	
	@Test
	public void queryRecordsForPage(){
		ExchangeRecords records=new ExchangeRecords();
		PageBounds pageBounds=new PageBounds();
		pageBounds.setLimit(10);
		pageBounds.setPage(0);
		records.setChannelcode("2");
		records.setChanneltype(1);
		records.setStartTime("2017-01-01");
		records.setEndTime("2017-01-08");
		BackMsgEntity result=exchangeRecordsService.selectForPage(records, pageBounds);
		System.out.print(result.getStatus());
	}
	@Test
	public void insertRecords(){
		ExchangeRecords records=new ExchangeRecords();
		records.setChannelcode("2");
		records.setChanneltype(1);
		records.setAddTime(new Date());
		records.setMemberId(10);
		records.setGoodsId(3);
		records.setExchangeCount(1);
		records.setExpenseIntegral(15);
		BackMsgEntity result=exchangeRecordsService.insert(records);
		System.out.println(result.getStatus());
	}
}
