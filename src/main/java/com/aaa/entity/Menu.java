package com.aaa.entity;
/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：Menu   
 * 类描述：   菜单表
 * 创建人：田浩毅   
 * 创建时间：2018年12月27日 下午9:41:51   
 *
 */
public class Menu {
	/**
	 * 菜单表
	 */
	private Integer mid;
	/**
	 * 菜单名字
	 */
	private String mname;
	/**
	 * 路径
	 */
	private String murl;
	/**
	 * 父菜单
	 */
	private Integer mfather;
	/**
	 * 菜单状态
	 */
	private Integer rmstate;
	
	private boolean lay_is_open = false;
	/**
	 * 菜单图标
	 */
	private String icon;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMurl() {
		return murl;
	}
	public void setMurl(String murl) {
		this.murl = murl;
	}
	public Integer getMfather() {
		return mfather;
	}
	public void setMfather(Integer mfather) {
		this.mfather = mfather;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getRmstate() {
		return rmstate;
	}
	public void setRmstate(Integer rmstate) {
		this.rmstate = rmstate;
	}
	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mname=" + mname + ", murl=" + murl
				+ ", mfather=" + mfather + ", icon=" + icon + "]";
	}
	public boolean isLay_is_open() {
		return lay_is_open;
	}
	public void setLay_is_open(boolean lay_is_open) {
		this.lay_is_open = lay_is_open;
	}
}
