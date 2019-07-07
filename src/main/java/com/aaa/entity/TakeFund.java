package com.aaa.entity;

import java.util.Date;

public class TakeFund {
	/**
	 * 个人公积金提取记录表
	 */
	private Integer fundid;
	/**
	 * 个人账户ID
	 */
	private Integer perid;
	/**
	 * 提取类型
	 */
	private String takefundtype;
	/**
	 * 提取金额
	 */
	private double takefundmoney;
	/**
	 * 提取原因
	 */
	private String takefundreason;
	/**
	 * 原因详情(其他)
	 */
	private String reasondetail;
	/**
	 * 提取时间
	 */
	/**
	 * 提取到的银行卡号
	 */
	private String takebankno;
	/**
	 * 约定提取时间
	 */
	private Integer agreedtime;
	/**
	 * 每月还款金额
	 */
	private double repaymoney;
	/**
	 * 约定期数
	 */
	private Integer agreedcount;
	/**
	 * 贷款类型
	 */
	private String loantype;
	
	
	public Integer getAgreedtime() {
		return agreedtime;
	}
	public void setAgreedtime(Integer agreedtime) {
		this.agreedtime = agreedtime;
	}
	public double getRepaymoney() {
		return repaymoney;
	}
	public void setRepaymoney(double repaymoney) {
		this.repaymoney = repaymoney;
	}
	public Integer getAgreedcount() {
		return agreedcount;
	}
	public void setAgreedcount(Integer agreedcount) {
		this.agreedcount = agreedcount;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getTakebankno() {
		return takebankno;
	}
	public void setTakebankno(String takebankno) {
		this.takebankno = takebankno;
	}
	private Date taketime;
	public Integer getFundid() {
		return fundid;
	}
	public void setFundid(Integer fundid) {
		this.fundid = fundid;
	}
	public Integer getPerid() {
		return perid;
	}
	public void setPerid(Integer perid) {
		this.perid = perid;
	}
	public String getTakefundtype() {
		return takefundtype;
	}
	public void setTakefundtype(String takefundtype) {
		this.takefundtype = takefundtype;
	}
	public double getTakefundmoney() {
		return takefundmoney;
	}
	public void setTakefundmoney(double takefundmoney) {
		this.takefundmoney = takefundmoney;
	}
	public String getTakefundreason() {
		return takefundreason;
	}
	public void setTakefundreason(String takefundreason) {
		this.takefundreason = takefundreason;
	}
	public String getReasondetail() {
		return reasondetail;
	}
	public void setReasondetail(String reasondetail) {
		this.reasondetail = reasondetail;
	}
	public Date getTaketime() {
		return taketime;
	}
	public void setTaketime(Date taketime) {
		this.taketime = taketime;
	}
	
	
}
