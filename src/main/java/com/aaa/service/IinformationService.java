package com.aaa.service;

import java.util.Map;

import com.aaa.entity.PageResult;
import com.aaa.entity.Person;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：IinformationService   
 * 类描述： 单位及员工账号信息管理  
 * 创建人：王鹏翔  
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
