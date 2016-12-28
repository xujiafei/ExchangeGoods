package com.hanshow.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.hanshow.apiutil.BackMsgEntity;
import com.hanshow.entity.ExchangeRecords;

public interface ExchangeRecordsService {
	BackMsgEntity selectForPage(ExchangeRecords record, PageBounds pageBounds);

	BackMsgEntity insert(ExchangeRecords record);

}