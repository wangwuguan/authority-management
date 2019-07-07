package com.aaa.entity;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：Role   
 * 类描述：  角色实体类
 * 创建人：will.Wang
 * 创建时间：2019年1月3日 下午7:21:38       
 */
public class Role {
	
	/**
	 * 角色id
	 */
	private Integer rid;
	/**
	 * 角色名称
	 */
	private String rname;
	/**
	 * 角色描述
	 */
	private String rdesc;
	/**
	 * 角色创建时间
	 */
	private String rtime;
	/**
	 * 角色状态
	 */
	private Integer rstate;
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRdesc() {
		return rdesc;
	}
	public void setRdesc(String rdesc) {
		this.rdesc = rdesc;
	}
	public String getRtime() {
		return rtime;
	}
	public void setRtime(String rtime) {
		this.rtime = rtime;
	}
	public Integer getRstate() {
		return rstate;
	}
	public void setRstate(Integer rstate) {
		this.rstate = rstate;
	}
	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", rdesc=" + rdesc
				+ ", rtime=" + rtime + ", rstate=" + rstate + "]";
	}
	
}
