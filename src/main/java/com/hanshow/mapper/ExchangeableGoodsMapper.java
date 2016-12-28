package com.hanshow.mapper;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.hanshow.entity.ExchangeableGoods;

public interface ExchangeableGoodsMapper {
	int insert(ExchangeableGoods goods);

	int update(ExchangeableGoods goods);

	int insertSelective(ExchangeableGoods goods);

	List<ExchangeableGoods> selectForPage(ExchangeableGoods goods, PageBounds pageBounds);
}