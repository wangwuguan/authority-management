package com.aaa.dao;

import java.util.List;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：IIformationDao   
 * 类描述： 关于单位及员工账号信息的管理 
 * 创建人：will.Wang
 * 创建时间：2019年1月8日 下午9:00:19       
 */
public interface InformationDao {

	/**
	 * @param map
	 * @return
	 */
	int updateCompany(Map<String, Object> map);
	
	/**
	 * @param p
	 * @return
	 */
	int updatePerson(Map<String,Object> map);

	/**
	 * @param user
	 * @return
	 */
	int addCompanyChangeRecords(Map<String,Object> map);

	/**
	 * @param user
	 * @return
	 */
	int addPersonChangeRecords(Map<String,Object> map);
	
	/**
	 * @param map
	 * @return
	 */
	Integer getCompanyCrecordsCount(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	List<Map> selectCompanyCrecords(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	Integer getPersonCrecordsCount(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	List<Map> selectPersonCrecords(Map<String, Object> map);

	
}
