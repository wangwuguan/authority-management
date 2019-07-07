package com.aaa.entity;

import java.util.Date;
/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：User   
 * 类描述：   后台管理人员
 * 创建人：田浩毅   
 * 创建时间：2018年12月27日 下午9:42:34   
 *
 */
public class User {
	/**
	 * 后台管理人员ID
	 */
	private Integer uid;
	/**
	 * 员工编号
	 */
	private Integer uno;
	/**
	 * 员工姓名
	 */
	private String uname;
	/**
	 * 家庭地址
	 */
	private String uaddress;
	/**
	 * 联系方式
	 */
	private String uphone;
	/**
	 * 员工邮箱
	 */
	private String uemail;
	/**
	 * 角色id
	 */
	private Integer roleid;
	/**
	 * 入职时间
	 */
	private String utime;
	/**
	 * 单位公积金id
	 */
	private Integer cid;
	/**
	 * 个人公积金id
	 */
	private Integer pid;
	/**
	 * 登录账号
	 */
	/*private String ulogin;*/
	/**
	 * 登录密码
	 */
	private Integer upassword;
	/**
	 * 员工状态
	 */
	private Integer ustate;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUno() {
		return uno;
	}
	public void setUno(Integer uno) {
		this.uno = uno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	public String getUtime() {
		return utime;
	}
	public void setUtime(String utime) {
		this.utime = utime;
	}
/*	public String getUlogin() {
		return ulogin;
	}
	public void setUlogin(String ulogin) {
		this.ulogin = ulogin;
	}*/
	public Integer getUpassword() {
		return upassword;
	}
	public void setUpassword(Integer upassword) {
		this.upassword = upassword;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public Integer getUstate() {
		return ustate;
	}
	public void setUstate(Integer ustate) {
		this.ustate = ustate;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uno=" + uno + ", uname=" + uname
				+ ", uaddress=" + uaddress + ", uphone=" + uphone + ", uemail="
				+ uemail + ", roleid=" + roleid + ", utime=" + utime + ", cid="
				+ cid + ", pid=" + pid + ", upassword=" + upassword
				+ ", ustate=" + ustate + "]";
	}
	
}
