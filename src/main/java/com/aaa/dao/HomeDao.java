package com.aaa.dao;

import java.util.List;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：HomeDao   
 * 类描述： 前台管理
 * 创建人：will.Wang
 * 创建时间：2019年1月17日 下午6:42:29       
 */
public interface HomeDao {

	/**
	 * @return
	 */
	List<Map> selectNews();

	/**
	 * @return
	 */
	Map selectNewsByNid(Map<String, Object> map);

	/**
	 * @param p
	 * @return
	 */
	Integer updatePersonPsd(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	Integer updateCompanyPsd(Map<String, Object> map);
	
}
