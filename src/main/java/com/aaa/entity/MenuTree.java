package com.aaa.entity;

import java.util.List;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：MenuTree   
 * 类描述：  树形菜单结构
 * 创建人：will.Wang
 * 创建时间：2019年1月7日 上午9:12:40       
 */
public class MenuTree {
	/**
	 * 菜单标题
	 */
	private String title;
	/**
	 * 菜单值
	 */
	private String value;
	/**
	 * 菜单的父级id
	 */
	private Integer mfatherId;
	/**
	 * 菜单是否为选中状态(默认或null为不选中)
	 */
	private boolean checked = false;
	/**
	 * 子菜单集合
	 */
	private List<MenuTree> data;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<MenuTree> getData() {
		return data;
	}
	public void setData(List<MenuTree> data) {
		this.data = data;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public Integer getMfatherId() {
		return mfatherId;
	}
	public void setMfatherId(Integer mfatherId) {
		this.mfatherId = mfatherId;
	}
	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "MenuTree [title=" + title + ", value=" + value + ", mfatherId="
				+ mfatherId + ", checked=" + checked + ", data=" + data + "]";
	}
	
	
}
