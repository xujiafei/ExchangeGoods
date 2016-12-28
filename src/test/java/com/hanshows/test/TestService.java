package com.hanshows.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hanshow.apiutil.BackMsgEntity;
import com.hanshow.entity.ExchangeableGoods;
import com.hanshow.service.ExchangeableGoodsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestService{

	@Autowired
	private ExchangeableGoodsService exchangeableGoodsService;
	private ExchangeableGoods goods;
	

	@Test
	public void insert(){
		goods.setAddtime(new Date());
		goods.setCode("223543");
		goods.setId(1);
		goods.setName("测试商品");
		goods.setNeedintegral(15);
		goods.setRemains(1000);
		BackMsgEntity result=exchangeableGoodsService.insert(goods);
		System.out.println(result);
	}
	
	@Test
	public void update(){
	}
	
	@Test
	public void delete(){
	}
	
	@Test
	public void queryForPage(){
	}
}
