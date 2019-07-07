package com.aaa.dao;

import java.util.List;
import java.util.Map;



/**
* 项目名称：AccumulationFund   
* 类名称：CollectionAcocuntDao   
* 类描述：提取、汇缴金额查询dao   
* 创建人：
* 创建时间：2019年1月21日 下午9:23:05     
* @version
 */
public interface CollectionAcocuntDao {
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
