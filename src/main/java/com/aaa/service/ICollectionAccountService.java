package com.aaa.service;


import java.util.List;
import java.util.Map;

public interface ICollectionAccountService {
	/**
	 * 根据日期查询个人提取公积金数量
	 *2019年1月21日 下午9:25:54
	 */
	List<Map> selFundByTime(Map<String, Object> map);
	/**
	 * 根据日期查询公司汇缴钱数
	 *2019年1月21日 下午9:26:34
	 */
	List<Map> selCompanyMoneyByTime(Map<String, Object> map);
}
