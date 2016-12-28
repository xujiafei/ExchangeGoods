package com.hanshow.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.hanshow.apiutil.BackMsgEntity;
import com.hanshow.entity.ExchangeableGoods;

public interface ExchangeableGoodsService {
	BackMsgEntity selectForPage(ExchangeableGoods goods, PageBounds pageBounds);

	BackMsgEntity insert(ExchangeableGoods goods);

	BackMsgEntity update(ExchangeableGoods goods);
}
