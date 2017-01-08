package com.hanshow.mapper;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.hanshow.entity.ExchangeRecords;

public interface ExchangeRecordsMapper {
	int insert(ExchangeRecords record);

	int insertSelective(ExchangeRecords record);

	List<ExchangeRecords> selectForPage(ExchangeRecords record, PageBounds pageBounds);
	List<ExchangeRecords> selectAll(ExchangeRecords record);
	int updateStatus(Integer id);
	
	int delete(Integer id);
}