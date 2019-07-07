package com.aaa.entity;

import java.util.List;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：MenuTreeT   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2019年1月10日 下午6:05:32       
 */

public class TreeTable<T> {

	/**
	 * 标示值（成功）
	 */
	private Integer code = 0;
	/**
	 * 
	 */
	private boolean is = true;
	/**
	 * 
	 */
	private String tip = "操作成功！";
	/**
	 * 
	 */
	private String msg = "";
	/**
	 * 
	 */
	private Integer count;
	/**
	 * 数据
	 */
	List<T> data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public boolean isIs() {
		return is;
	}
	public void setIs(boolean is) {
		this.is = is;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
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
		return "TreeTable [code=" + code + ", is=" + is + ", tip=" + tip
				+ ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}
	
	
	
}
