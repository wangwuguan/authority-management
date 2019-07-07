package com.aaa.dao;

import java.util.Map;

import com.aaa.entity.Company;
import com.aaa.entity.Person;
import com.aaa.entity.User;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：LoginDao   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2018年12月28日 下午7:22:27       
 */
public interface LoginDao {

	/**
	 * @param uno
	 * @param upassword
	 * @return
	 */
	User userLogin(Map<String,Object> map);

	/**
	 * @param map
	 * @return
	 */
	Person personLogin(Map<String, Object> map);

	/**
	 * @param map
	 * @return
	 */
	Company companyLogin(Map<String, Object> map);

}
