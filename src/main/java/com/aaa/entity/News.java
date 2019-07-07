package com.aaa.entity;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：News   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2019年1月17日 下午7:08:56       
 */

public class News {

	/**
	 * 新闻id
	 */
	private Integer nid;
	
	/**
	 * 新闻标题
	 */
	private String ntitle;
	
	/**
	 * 新闻内容
	 */
	private String ncontent;
	
	/**
	 * 图片链接
	 */
	private String nsrc;
	
	/**
	 * 创建时间
	 */
	private String ntime;
	
	/**
	 * 发布时间
	 */
	private String ntime2;
	
	/**
	 * 新闻状态
	 */
	private Integer nstate;

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNsrc() {
		return nsrc;
	}

	public void setNsrc(String nsrc) {
		this.nsrc = nsrc;
	}

	public String getNtime() {
		return ntime;
	}

	public void setNtime(String ntime) {
		this.ntime = ntime;
	}

	public Integer getNstate() {
		return nstate;
	}

	public void setNstate(Integer nstate) {
		this.nstate = nstate;
	}

	public String getNtime2() {
		return ntime2;
	}

	public void setNtime2(String ntime2) {
		this.ntime2 = ntime2;
	}
	
	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "News [nid=" + nid + ", ntitle=" + ntitle + ", ncontent="
				+ ncontent + ", nsrc=" + nsrc + ", ntime=" + ntime + ", ntime2=" + ntime2
				+ ", nstate=" + nstate + "]";
	}

	
	
	
	
}
