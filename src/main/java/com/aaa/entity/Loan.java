package com.aaa.entity;

import java.util.Date;
/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：Loan   
 * 类描述： 贷款表实体类
 * 创建人：
 * 创建时间：2019年1月7日 下午7:06:55   
 *
 */
public class Loan {
	/**
	 * 贷款表主键id
	 */
	private Integer lid;
	
	/**
	 * 贷款单号 lno
	 */
	private String lno;
	
	/**
	 * 贷款人个人账号
	 */
	private String personno;
	
	/**
	 * 贷款人月收入
	 */
	private Double lsalay;
	
	/**
	 * 存款
	 */
	private Double ldeposit;
	
	/**
	 * 贷款金额
	 */
	private Double lmoney;
	
	/**
	 * 贷款期数
	 */
	private int lperiods;
	/**
	 * 申请日期
	 */
	private Date lapplydate;
	/**
	 * 委托银行
	 */
	private String lction;
	
	/**
	 * 贷款人
	 */
	private String lname;
	
	/**
	 * 贷款利率
	 */
	private Double lrate;
	
	/**
	 * 还款类型
	 */
	private String lrefundtype;
	
	/**
	 * 开户银行
	 */
	private String lopenbank;
	
	/**
	 * 还款人
	 */
	private String lpayment;
	
	/**
	 * 还款账号
	 */
	private String lcardno;
	
	/**
	 * 担保人账号
	 */
	private String lunderwriterno;
	
	/**
	 * 房屋类型
	 */
	private String lhousetype;
	
	/**
	 * 房屋地址
	 */
	private String laddress;
	
	/**
	 * 房屋面积
	 */
	private String lallarea;
	
	/**
	 * 证件号码
	 */
	private String lhouseno;
	
	/**
	 * 购房人姓名
	 */
	private String lbuyname;
	
	/**
	 * 买房银行账户
	 */
	private String lbuycardno;
	
	/**
	 * 房屋总价
	 */
	private Double lhouseprice;
	
	/**
	 * 首付款
	 */
	private Double lfirstpay;
	
	/**
	 * 面积单价
	 */
	private Double lareaprice;
	
	/**
	 * 抵押类型
	 */
	private String lcollateraltype;
	
	/**
	 * 抵押人姓名
	 */
	private String lcollateralname;
	
	/**
	 * 抵押人身份证号码
	 */
	private String lcollateralnumber;
	
	/**
	 * 抵押物地址
	 */
	private String lcollateraladdress;
	
	/**
	 * 抵押物状态
	 */
	private String lcollateralstate;
	
	/**
	 * 抵押物金额
	 */
	private Double lcollateralacount;
	
	/**
	 * 贷款状态
	 */
	private Integer lstateid;
	
	/**
	 * 驳回意见
	 * @return
	 */
	private String lrejecttext;
	
	public String getLrejecttext() {
		return lrejecttext;
	}

	public void setLrejecttext(String lrejecttext) {
		this.lrejecttext = lrejecttext;
	}

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getPersonno() {
		return personno;
	}

	public void setPersonno(String personno) {
		this.personno = personno;
	}

	public Double getLmoney() {
		return lmoney;
	}

	public void setLmoney(Double lmoney) {
		this.lmoney = lmoney;
	}

	public int getLperiods() {
		return lperiods;
	}

	public void setLperiods(int lperiods) {
		this.lperiods = lperiods;
	}

	public String getLction() {
		return lction;
	}

	public void setLction(String lction) {
		this.lction = lction;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Double getLrate() {
		return lrate;
	}

	public void setLrate(Double lrate) {
		this.lrate = lrate;
	}

	public String getLrefundtype() {
		return lrefundtype;
	}

	public void setLrefundtype(String lrefundtype) {
		this.lrefundtype = lrefundtype;
	}

	public String getLopenbank() {
		return lopenbank;
	}

	public void setLopenbank(String lopenbank) {
		this.lopenbank = lopenbank;
	}

	public String getLpayment() {
		return lpayment;
	}

	public void setLpayment(String lpayment) {
		this.lpayment = lpayment;
	}

	public String getLcardno() {
		return lcardno;
	}

	public void setLcardno(String lcardno) {
		this.lcardno = lcardno;
	}

	public String getLunderwriterno() {
		return lunderwriterno;
	}

	public void setLunderwriterno(String lunderwriterno) {
		this.lunderwriterno = lunderwriterno;
	}

	public String getLhousetype() {
		return lhousetype;
	}

	public void setLhousetype(String lhousetype) {
		this.lhousetype = lhousetype;
	}

	public String getLaddress() {
		return laddress;
	}

	public void setLaddress(String laddress) {
		this.laddress = laddress;
	}

	public String getLallarea() {
		return lallarea;
	}

	public void setLallarea(String lallarea) {
		this.lallarea = lallarea;
	}

	public String getLhouseno() {
		return lhouseno;
	}

	public void setLhouseno(String lhouseno) {
		this.lhouseno = lhouseno;
	}

	public String getLbuyname() {
		return lbuyname;
	}

	public void setLbuyname(String lbuyname) {
		this.lbuyname = lbuyname;
	}

	public String getLbuycardno() {
		return lbuycardno;
	}

	public void setLbuycardno(String lbuycardno) {
		this.lbuycardno = lbuycardno;
	}

	public Double getLhouseprice() {
		return lhouseprice;
	}

	public void setLhouseprice(Double lhouseprice) {
		this.lhouseprice = lhouseprice;
	}

	public Double getLfirstpay() {
		return lfirstpay;
	}

	public void setLfirstpay(Double lfirstpay) {
		this.lfirstpay = lfirstpay;
	}

	public Double getLareaprice() {
		return lareaprice;
	}

	public void setLareaprice(Double lareaprice) {
		this.lareaprice = lareaprice;
	}

	public String getLcollateraltype() {
		return lcollateraltype;
	}

	public void setLcollateraltype(String lcollateraltype) {
		this.lcollateraltype = lcollateraltype;
	}

	public String getLcollateralname() {
		return lcollateralname;
	}

	public void setLcollateralname(String lcollateralname) {
		this.lcollateralname = lcollateralname;
	}

	public String getLcollateralnumber() {
		return lcollateralnumber;
	}

	public void setLcollateralnumber(String lcollateralnumber) {
		this.lcollateralnumber = lcollateralnumber;
	}

	public String getLcollateraladdress() {
		return lcollateraladdress;
	}

	public void setLcollateraladdress(String lcollateraladdress) {
		this.lcollateraladdress = lcollateraladdress;
	}
	

	public String getLcollateralstate() {
		return lcollateralstate;
	}

	public void setLcollateralstate(String lcollateralstate) {
		this.lcollateralstate = lcollateralstate;
	}

	public Double getLcollateralacount() {
		return lcollateralacount;
	}

	public void setLcollateralacount(Double lcollateralacount) {
		this.lcollateralacount = lcollateralacount;
	}

	public Double getLsalay() {
		return lsalay;
	}

	public void setLsalay(Double lsalay) {
		this.lsalay = lsalay;
	}

	public Integer getLstateid() {
		return lstateid;
	}

	public void setLstateid(Integer lstateid) {
		this.lstateid = lstateid;
	}

	public Double getLdeposit() {
		return ldeposit;
	}

	public void setLdeposit(Double ldeposit) {
		this.ldeposit = ldeposit;
	}

	public Date getLapplydate() {
		return lapplydate;
	}

	public void setLapplydate(Date lapplydate) {
		this.lapplydate = lapplydate;
	}

	public String getLno() {
		return lno;
	}

	public void setLno(String lno) {
		this.lno = lno;
	}
	

	
}
	
