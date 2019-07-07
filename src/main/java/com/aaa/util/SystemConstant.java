package com.aaa.util;

/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：SystemConstant   
 * 类描述：项目所需常量   
 * 创建人：王鹏翔  
 * 创建时间：2018年12月28日 上午9:27:22
 */
public interface SystemConstant {
	
	/**
	 * 返回 成功
	 */
	String SUCCESS = "success";
	
	/**
	 * 个人公积金账号登录成功
	 */
	String PERSON_SUCCESS = "personSuccess";
	
	/**
	 * 单位公积金账号登录陈宫成功
	 */
	String COMPANY_SUCCESS = "companySuccess";
	
	/**
	 * 返回 失败
	 */
	String FAIL = "fail";
	
	/**
	 * 员工 session
	 */
	String USER = "user";
	
	/**
	 * 个人公积金账号登录session
	 */
	String PERSON = "person";
	
	/**
	 * 单位公积金账号登录session
	 */
	String COMPANY = "company";
	
	/**
	 * 日志所需常量(单位)
	 * 开户
	 */
	Integer OPEN_ACCOUNT = 1;               
	
	/**
	 * 开户审核
	 */
	Integer OPEN_AUDIT = 2;
	
	/**
	 * 基本信息修改
	 */
	Integer INFORMATION_UPDATE = 3;
	
	/**
	 * 比例变更
	 */
	Integer PERCENTAGE_CHANGE = 4;
	
	/**
	 * 基数调整
	 */
	Integer BASE_ADJUSTMENT = 5;
	
	/**
	 * 日志所需常量(个人)
	 * 人员转移
	 */
	Integer PERSONNEL_TRANSFER = 4;
	
	/**
	 * 封存账号sequestration
	 */
	Integer SEQUESTRATION_ACCOUNT = 5;
	
	/**
	 * 启封账号unsealed
	 */
	Integer UNSELED_ACCOUNT = 6;
	
	/**
	 * 销户Pin households
     */
	Integer PIN_HOUSEHOLDS = 7;
	
	/**
	 * 个人贷款初次审核
	 */
	Integer FIRST_REVIEW= 8;
	
	/**
	 * 个人贷款最终审核
	 */
	Integer LAST_REVIEW= 9;
	
	/**
	 * 单位明细查询(操作)
	 */
	String REMIT = "汇缴";
	
	String PAYMENT = "补缴";
	
	String RUSH = "冲缴";
	
	/**
	 * 公积金账户状态表state状态常量
	 */
	Integer WAIT_AUDIT = 1 ;			//待审核
	
	Integer NORMAL = 2 ;				//正常
	
	Integer FIRST_AUDIT_FAILD = 3 ;		//初审未通过
	
	Integer RE_AUDITING = 4 ; 			//复审中
	
	Integer LOAN_SUCCESS = 5 ;			//贷款成功
	
	Integer REFUNDING = 6 ;				//还款中
	
	Integer REAUDIT_FAILD = 7 ;			//复审未通过
	
	Integer NO_DEPOSITE  = 11 ;			//未缴存
	
	Integer DEPOSITED = 12 ;			//已缴存
	
	Integer REFUND_OVER = 13 ;			//还款完毕
	
	/**
	 *个人账户状态表 -- 状态常量
	 */
	Integer PERSONAL_WAIT_AUDIT = 0	;			//个人开户待审核
	
	Integer NORMALS = 1 ;						//正常
	
	Integer PERSONAL_TRANSFER = 2 ;				//人员转移审核中
	
	Integer OPEN_ACCOUNTS = 3 ;					//待启封
	
	Integer WAIT_CLOSE_ACCOUNT = 4 ;			//待销户
	
	Integer CLOSE_ACCOUNT = 5 ;					//封存
	
	Integer CLOSED_ACCOUNT = 6 ;				//已销户
   
	//	Integer 7	
	
	Integer PERSONAL_TRANSFER_FAIL = 8 ;		//人员转移审核未通过
	
	Integer PERSONAL_TRANSFER_SUCCESS = 9;		//人员转移审核通过
	
	Integer CLOSING_ACCOUNT = 10;				//待封存
	
	Integer EXTRACTING_WAIT_AUDIT = 11;			//提取待审核
	
	Integer EXTRACT_SUCCESS = 12;				//成功提取
	
	Integer PERSONAL_AUDIT_FAIL = 13;			//开户审核未通过
	
	 
	
	
	
	
	
	
	
	
	
	
	
}
