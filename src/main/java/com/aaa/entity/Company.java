package com.aaa.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：Company   
 * 类描述：   公司信息表
 * 创建人：
 * 创建时间：2018年12月27日 下午9:40:48   
 *
 */
public class Company {
	/**
	 * 公司信息表ID
	 */
	private Integer cid;
	/**
	 * 公司公积金账号
	 */
	private String cno;
	/**
	 * 公司名称
	 */
	private String cname;
	/**
	 * 公司地址
	 */
	private String csite;
	/**
	 * 公司类型
	 */
	private String ctype;
	/**
	 * 所属行业
	 */
	private String cindustry;
	/**
	 * 隶属关系
	 */
	private String crelation;
	/**
	 * 经济类型
	 */
	private String ceconomic;
	/**
	 * 机构代码
	 */
	private Integer cinstitution;
	/**
	 * 月发薪日
	 */
	private Integer cmonth;
	/**
	 * 法人代表名字
	 */
	private String clegal;
	/**
	 * 法人证件类型
	 */
	private String ccertificate;
	/**
	 * 法人证件号码
	 */
	private String cnumber;
	/**
	 * 经办人姓名
	 */
	private String coperator;
	/**
	 * 经办人电话
	 */
	private String cphone;
	/**
	 * 经办人证件类型
	 */
	private String ccertificates;
	/**
	 * 经办人证件号码
	 */
	private String cnumbers;
	/**
	 * 公司成立日期
	 */
	private String ctime;
	/**
	 * 开户银行名字
	 */
	private String cbank;
	/**
	 * 开户日期
	 */
	private String cdate;
	/**
	 * 开户银行账户
	 */
	private String cbankno;
	/**
	 * 单位缴存比例
	 */
	private Integer cdeposit;
	/**
	 * 个人缴存比例
	 */
	private Integer cdeposits;
	/**
	 * 账号开户状态
	 */
	private Integer stateid;
	/**
	 * 业务操作人员
	 */
	private Integer userid;
	/**
	 * 受托银行名字
	 */
	private String cbanks;
	/**
	 * 上传营业执照
	 */
	private String curl;
	/**
	 * 单位账户余额
	 */
	private Integer cbalanc;
	/**
	 * 驳回理由
	 */
	private String cback;
	/**
	 * 缴存人数
	 */
	private Integer cputsno;
	/**
	 * 缴至日期
	 */
	private String cdatetime;
	/**
	 * 登录密码
	 */
	private String cpassword;
	/**
	 * 公司类型
	 */
	private String ctname;
	/**
	 * 所属行业
	 */
	private String iname;
	/**
	 * 隶属关系
	 */
	private String rename;
	/**
	 * 经济类型
	 */
	private String etname;
	/**
	 * 银行名字
	 */
	private String bname;
	/**
	 * 状态
	 */
	private String sname;
	/**
	 * 管理员
	 */
	private String uname;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCsite() {
		return csite;
	}
	public void setCsite(String csite) {
		this.csite = csite;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getCindustry() {
		return cindustry;
	}
	public void setCindustry(String cindustry) {
		this.cindustry = cindustry;
	}
	public String getCrelation() {
		return crelation;
	}
	public void setCrelation(String crelation) {
		this.crelation = crelation;
	}
	public String getCeconomic() {
		return ceconomic;
	}
	public void setCeconomic(String ceconomic) {
		this.ceconomic = ceconomic;
	}
	public Integer getCinstitution() {
		return cinstitution;
	}
	public void setCinstitution(Integer cinstitution) {
		this.cinstitution = cinstitution;
	}
	public Integer getCmonth() {
		return cmonth;
	}
	public void setCmonth(Integer cmonth) {
		this.cmonth = cmonth;
	}
	public String getClegal() {
		return clegal;
	}
	public void setClegal(String clegal) {
		this.clegal = clegal;
	}
	public String getCcertificate() {
		return ccertificate;
	}
	public void setCcertificate(String ccertificate) {
		this.ccertificate = ccertificate;
	}
	public String getCnumber() {
		return cnumber;
	}
	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}
	public String getCoperator() {
		return coperator;
	}
	public void setCoperator(String coperator) {
		this.coperator = coperator;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCcertificates() {
		return ccertificates;
	}
	public void setCcertificates(String ccertificates) {
		this.ccertificates = ccertificates;
	}
	public String getCnumbers() {
		return cnumbers;
	}
	public void setCnumbers(String cnumbers) {
		this.cnumbers = cnumbers;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public String getCbank() {
		return cbank;
	}
	public void setCbank(String cbank) {
		this.cbank = cbank;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getCbankno() {
		return cbankno;
	}
	public void setCbankno(String cbankno) {
		this.cbankno = cbankno;
	}
	public Integer getCdeposit() {
		return cdeposit;
	}
	public void setCdeposit(Integer cdeposit) {
		this.cdeposit = cdeposit;
	}
	public Integer getCdeposits() {
		return cdeposits;
	}
	public void setCdeposits(Integer cdeposits) {
		this.cdeposits = cdeposits;
	}
	public Integer getStateid() {
		return stateid;
	}
	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getCbanks() {
		return cbanks;
	}
	public void setCbanks(String cbanks) {
		this.cbanks = cbanks;
	}
	public String getCurl() {
		return curl;
	}
	public void setCurl(String curl) {
		this.curl = curl;
	}
	public Integer getCbalanc() {
		return cbalanc;
	}
	public void setCbalanc(Integer cbalanc) {
		this.cbalanc = cbalanc;
	}
	public String getCback() {
		return cback;
	}
	public void setCback(String cback) {
		this.cback = cback;
	}
	public Integer getCputsno() {
		return cputsno;
	}
	public void setCputsno(Integer cputsno) {
		this.cputsno = cputsno;
	}
	public String getCdatetime() {
		return cdatetime;
	}
	public void setCdatetime(String cdatetime) {
		this.cdatetime = cdatetime;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getCtname() {
		return ctname;
	}
	public void setCtname(String ctname) {
		this.ctname = ctname;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getRename() {
		return rename;
	}
	public void setRename(String rename) {
		this.rename = rename;
	}
	public String getEtname() {
		return etname;
	}
	public void setEtname(String etname) {
		this.etname = etname;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cno=" + cno + ", cname=" + cname
				+ ", csite=" + csite + ", ctype=" + ctype + ", cindustry="
				+ cindustry + ", crelation=" + crelation + ", ceconomic="
				+ ceconomic + ", cinstitution=" + cinstitution + ", cmonth="
				+ cmonth + ", clegal=" + clegal + ", ccertificate="
				+ ccertificate + ", cnumber=" + cnumber + ", coperator="
				+ coperator + ", cphone=" + cphone + ", ccertificates="
				+ ccertificates + ", cnumbers=" + cnumbers + ", ctime=" + ctime
				+ ", cbank=" + cbank + ", cdate=" + cdate + ", cbankno="
				+ cbankno + ", cdeposit=" + cdeposit + ", cdeposits="
				+ cdeposits + ", stateid=" + stateid + ", userid=" + userid
				+ ", cbanks=" + cbanks + ", curl=" + curl + ", cbalanc="
				+ cbalanc + ", cback=" + cback + ", cputsno=" + cputsno
				+ ", cdatetime=" + cdatetime + ", cpassword=" + cpassword
				+ ", ctname=" + ctname + ", iname=" + iname + ", rename="
				+ rename + ", etname=" + etname + "]";
	}
	
	

}
