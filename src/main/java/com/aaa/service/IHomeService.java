package com.aaa.service;

import com.aaa.entity.Company;
import com.aaa.entity.Person;

import java.util.List;
import java.util.Map;



/**      
 * 项目名称：AccumulationFund   
 * 类名称：IHomeService   
 * 类描述：   
 * 创建人：will.Wang
 * 创建时间：2019年1月17日 下午6:46:23       
 */

public interface IHomeService {

	/**
	 * @return
	 */
	List<Map> selectNews();

	/**
	 * @param map
	 * @return
	 */
	Map selectNewsByNid(Map<String, Object> map);

	/**
	 * @param p
	 * @return
	 */
	String checkPersonalPsd(Person p);

	/**
	 * @param p
	 * @return
	 */
	String updatePersonPsd(Map<String, Object> map);

	/**
	 * @param p
	 * @return
	 */
	String checkCompanyPsd(Company c);

	/**
	 * @param map
	 * @return
	 */
	String updateCompanyPsd(Map<String, Object> map);

}
