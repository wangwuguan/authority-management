package com.aaa.entity;

import java.util.Date;

/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：Refund   
 * 类描述： 还款表实体类
 * 创建人：
 * 创建时间：2019年12月28日 下午5:06:30   
 *
 */
public class Refund {
	/**
	 * 还款表的id
	 */
	private Integer rid;
	
	/**
	 * 还款编号
	 */
	private String rno;
	/**
	 * 还款表贷款人账号
	 */
	private String rpno;
	
	/**
	 * 贷款的总金额
	 */
	private Double rallmoney;
	
	/**
	 * 还款类型
	 */
	private String rtype;
	
	/**
	 * 已还贷款
	 */
	private Double rhavemoney;
	
	/**
	 * 贷款期数
	 */
	private Integer rallperiods;
	
	/**
	 * 状态
	 */
	private Integer rstateid;
	
	/**
	 * 已还期数
	 */
	private Integer rhaveperiods;
	
	/**
	 * 还款利率
	 */
	private Double rrate;
	
	/**
	 * 创建时间
	 */
	private Date rcreatetime;
	
	/**
	 * 上一次还款日期
	 */
	private Date rlasttime;
	
	/**
	 * 本月要还贷款
	 */
	private Double rmoney;
	
	/**
	 * 最迟还款日
	 */
	private Date rtime;
	
	/**
	 * 本月要换本金
	 */
	private Double rcapital;
	
	/**
	 * 本月要换利息
	 */
	private Double rinterest;
	
	/**
	 * 已还本金
	 */
	private Double rhavecapital;
	
	/**
	 * 已还利息
	 */
	private Double rhaveinterest;
	
	/**
	 * 罚息
	 * @return
	 */
	private Double rdefaultinterest;
	
	
	

	public Double getRdefaultinterest() {
		return rdefaultinterest;
	}

	public void setRdefaultinterest(Double rdefaultinterest) {
		this.rdefaultinterest = rdefaultinterest;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public Double getRcapital() {
		return rcapital;
	}

	public void setRcapital(Double rcapital) {
		this.rcapital = rcapital;
	}

	public Double getRinterest() {
		return rinterest;
	}

	public void setRinterest(Double rinterest) {
		this.rinterest = rinterest;
	}

	public Double getRhavecapital() {
		return rhavecapital;
	}

	public void setRhavecapital(Double rhavecapital) {
		this.rhavecapital = rhavecapital;
	}

	public Double getRhaveinterest() {
		return rhaveinterest;
	}

	public void setRhaveinterest(Double rhaveinterest) {
		this.rhaveinterest = rhaveinterest;
	}

	public Double getRrate() {
		return rrate;
	}

	public void setRrate(Double rrate) {
		this.rrate = rrate;
	}

	public Refund() {
		super();
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRpno() {
		return rpno;
	}

	public void setRpno(String rpno) {
		this.rpno = rpno;
	}

	public Double getRallmoney() {
		return rallmoney;
	}

	public void setRallmoney(Double rallmoney) {
		this.rallmoney = rallmoney;
	}

	public Double getRhavemoney() {
		return rhavemoney;
	}

	public void setRhavemoney(Double rhavemoney) {
		this.rhavemoney = rhavemoney;
	}

	public Integer getRallperiods() {
		return rallperiods;
	}

	public void setRallperiods(Integer rallperiods) {
		this.rallperiods = rallperiods;
	}

	public Integer getRhaveperiods() {
		return rhaveperiods;
	}

	public void setRhaveperiods(Integer rhaveperiods) {
		this.rhaveperiods = rhaveperiods;
	}

	public Date getRcreatetime() {
		return rcreatetime;
	}

	public void setRcreatetime(Date rcreatetime) {
		this.rcreatetime = rcreatetime;
	}

	public Date getRlasttime() {
		return rlasttime;
	}

	public void setRlasttime(Date rlasttime) {
		this.rlasttime = rlasttime;
	}

	public Double getRmoney() {
		return rmoney;
	}

	public void setRmoney(Double rmoney) {
		this.rmoney = rmoney;
	}

	public Date getRtime() {
		return rtime;
	}

	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}

	public Integer getRstateid() {
		return rstateid;
	}

	public void setRstateid(Integer rstateid) {
		this.rstateid = rstateid;
	}

	public String getRtype() {
		return rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	
}
