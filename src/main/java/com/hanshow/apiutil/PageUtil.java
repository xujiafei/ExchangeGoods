package com.hanshow.apiutil;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.hanshow.entity.PagePo;

/**
 * @author ShaZhiDa
 * @date 2016年11月18日 上午9:20:25
 * @Description: 分页工具类
 * @version V1.0
 */
public class PageUtil {
	public static PagePo initPageWithNewList(Object data,PageBounds bounds,Integer totalCount){
		PagePo page = new PagePo();
		page.setCurrent_page(bounds.getPage());
		int limit = bounds.getLimit();
		page.setPage_size(limit);
		
		page.setCount(totalCount);
		int pageCount = totalCount%limit==0?totalCount/limit:totalCount/limit+1;
		page.setPage_count(pageCount);
		page.setList(data);
		return page;
	}
	
	public static PagePo initPage(Object data,PageBounds bounds){
		PagePo page = new PagePo();
		page.setCurrent_page(bounds.getPage());
		int limit = bounds.getLimit();
		page.setPage_size(limit);
		
		@SuppressWarnings("rawtypes")
		PageList pageList = (PageList)data; 
		int totalCount = pageList.getPaginator().getTotalCount();
		page.setCount(totalCount);
		int pageCount = totalCount%limit==0?totalCount/limit:totalCount/limit+1;
		page.setPage_count(pageCount);
		page.setList(data);
		return page;
	}
	
	public static PageBounds initParam(Integer page,Integer limit){
		if(page==null) page=1;
		if(limit==null) limit=10;
		PageBounds pageBounds = new PageBounds(page,limit);
		return pageBounds;
	}
}
