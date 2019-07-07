package com.aaa.entity;

import groovy.transform.ToString;

import java.util.Date;
/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：Person   
 * 类描述：   客户个人信息表
 * 创建人：田浩毅   
 * 创建时间：2018年12月27日 下午9:42:04   
 *
 */
@ToString 
public class Person {
	/**
	 * 个人信息表
	 */
	private Integer pid;
	public Integer getNewcid() {
		return newcid;
	}
	public void setNewcid(Integer newcid) {
		this.newcid = newcid;
	}
	/**
	 * 姓名
	 */
	private String pname;
	/**
	 * 个人公积金账号
	 */
	private String pno;
	/**
	 * 电话
	 */
	private String pphone;
	/**
	 * 邮箱
	 */
	private String pmail;
	/**
	 * 性别
	 */
	private String psex;
	/**
	 * 婚姻状况
	 */
	private String pmarital;
	/**
	 * 受教育程度(学历)
	 */
	private String pdegree;
	/**
	 * 审核状态
	 */
	private Integer pstateid;
	/**
	 * 公司信息表
	 */
	private Integer acid;
	/**
	 * 转移新公司ID
	 */
	private Integer newcid;
	/**
	 * 证件类型
	 */
	private String pcertificate;
	/**
	 * 证件号
	 */
	private String pnumber;
	/**
	 * 汇缴基数
	 */
	private Integer pbasenum;
	/**
	 * 开户银行
	 */
	private String pbank;
	/**
	 * 银行卡号
	 */
	private String pbankno;
	/**
	 * 家庭地址
	 */
	private String paddress;
	/**
	 * 身份证正
	 */
	private String pcardt;
	/**
	 * 身份证反
	 */
	private String pcardf;
	/**
	 * 申请时间(now)
	 */
	private Date ptime;
	/**
	 * 驳回意见
	 */
	private String pback;
	/**
	 * 个人余额
	 */
	private double pmoney;
	/**
	 * 汇缴日期
	 * @return
	 */
	private Date premitdate;
	/**
	 * 单位缴存余额
	 * @return
	 */
	private double counts;
	/**
	 * 个人缴存余额
	 * @return
	 */
	private double countss;
	/**
	 * 登录密码
	 */
	private String ppassword;
	/**
	 * 封存 启封 销户理由
	 */
	private String changereason;
	
	
	public String getChangereason() {
		return changereason;
	}
	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	
	public String getPphone() {
		return pphone;
	}
	public void setPphone(String pphone) {
		this.pphone = pphone;
	}
	public String getPmail() {
		return pmail;
	}
	public void setPmail(String pmail) {
		this.pmail = pmail;
	}
	public String getPsex() {
		return psex;
	}
	public void setPsex(String psex) {
		this.psex = psex;
	}
	public String getPmarital() {
		return pmarital;
	}
	public void setPmarital(String pmarital) {
		this.pmarital = pmarital;
	}
	public String getPdegree() {
		return pdegree;
	}
	public void setPdegree(String pdegree) {
		this.pdegree = pdegree;
	}
	
	public Integer getPstateid() {
		return pstateid;
	}
	public void setPstateid(Integer pstateid) {
		this.pstateid = pstateid;
	}
	public Integer getAcid() {
		return acid;
	}
	public void setAcid(Integer acid) {
		this.acid = acid;
	}
	public String getPcertificate() {
		return pcertificate;
	}
	public void setPcertificate(String pcertificate) {
		this.pcertificate = pcertificate;
	}
	public String getPnumber() {
		return pnumber;
	}
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	public Integer getPbasenum() {
		return pbasenum;
	}
	public void setPbasenum(Integer pbasenum) {
		this.pbasenum = pbasenum;
	}
	public String getPbank() {
		return pbank;
	}
	public void setPbank(String pbank) {
		this.pbank = pbank;
	}
	public String getPbankno() {
		return pbankno;
	}
	public void setPbankno(String pbankno) {
		this.pbankno = pbankno;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPcardt() {
		return pcardt;
	}
	public void setPcardt(String pcardt) {
		this.pcardt = pcardt;
	}
	public String getPcardf() {
		return pcardf;
	}
	public void setPcardf(String pcardf) {
		this.pcardf = pcardf;
	}
	public Date getPtime() {
		return ptime;
	}
	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}
	public String getPback() {
		return pback;
	}
	public void setPback(String pback) {
		this.pback = pback;
	}
	public double getPmoney() {
		return pmoney;
	}
	public void setPmoney(double pmoney) {
		this.pmoney = pmoney;
	}
	public Date getPremitdate() {
		return premitdate;
	}
	public void setPremitdate(Date premitdate) {
		this.premitdate = premitdate;
	}
	public double getCounts() {
		return counts;
	}
	public void setCounts(double counts) {
		this.counts = counts;
	}
	public double getCountss() {
		return countss;
	}
	public void setCountss(double countss) {
		this.countss = countss;
	}
	public String getPpassword() {
		return ppassword;
	}
	public void setPpassword(String ppassword) {
		this.ppassword = ppassword;
	}
	
	
}
