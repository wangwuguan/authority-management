package com.aaa.entity;

import java.util.List;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：PageResult   
 * 类描述：   
 * 创建人：will.Wang
 * 创建时间：2018年12月29日 下午3:51:32       
 */

public class PageResult<T> {
	/**
	 * 接口状态
	 */
	private Integer code = 0;
	/**
	 * 提示文本
	 */
	private String msg = "";
	/**
	 * 数据长度
	 */
	private int count;
	/**
	 * 数据列表
	 */
	private List<T> data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "PageResult [code=" + code + ", msg=" + msg + ", count=" + count
				+ ", data=" + data + "]";
	}
	
}
