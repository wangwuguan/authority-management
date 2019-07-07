package com.aaa.service;

import com.aaa.entity.PageResult;

import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：IinformationService   
 * 类描述： 单位及员工账号信息管理  
 * 创建人：will.Wang
 * 创建时间：2019年1月8日 下午9:01:34       
 */
public interface IinformationService {

	/**
	 * @param p
	 * @return
	 */
	String updatePerson(Map<String,Object> map);

	/**
	 * @param map
	 * @return
	 */
	String updateCompany(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	PageResult<Map> selectCompanyCrecords(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	PageResult<Map> selectPersonCrecords(Map<String, Object> map);
	
}
