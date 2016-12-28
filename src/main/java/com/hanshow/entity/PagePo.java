package com.hanshow.entity;

/**
 * @author ShaZhiDa
 * @date 2016年11月18日 上午9:21:46
 * @Description: 分页实体
 * @version V1.0
 */
public class PagePo {
	private Integer count;//总记录条数
	private Integer current_page;//当前页码
	private Integer page_size;//分页大小
	private Integer page_count;//总页数
	private Object list;//数据集
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCurrent_page() {
		return current_page;
	}
	public void setCurrent_page(Integer current_page) {
		this.current_page = current_page;
	}
	public Integer getPage_size() {
		return page_size;
	}
	public void setPage_size(Integer page_size) {
		this.page_size = page_size;
	}
	public Integer getPage_count() {
		return page_count;
	}
	public void setPage_count(Integer page_count) {
		this.page_count = page_count;
	}
	public Object getList() {
		return list;
	}
	public void setList(Object list) {
		this.list = list;
	}
	
	
}
