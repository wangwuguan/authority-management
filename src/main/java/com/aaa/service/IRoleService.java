package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.PageResult;
import com.aaa.entity.Role;


/**      
 * 项目名称：AccumulationFund   
 * 类名称：IRoleService   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2019年1月2日 下午4:16:25       
 */

public interface IRoleService {
	
	PageResult<Map> selectRole(Map map);

	/**
	 * @return
	 */
	List<Map> selectRoleAll();

	/**
	 * @param r
	 * @return
	 */
	String addRole(Role r);

	/**
	 * @param u
	 * @return
	 */
	String updateRole(Role u);

	/**
	 * @param u
	 * @return
	 */
	String updateRoleState(Role u);

	/**
	 * @param map
	 */
	String accreditRole(Map map);

	/**
	 * @param map
	 * @return
	 */
	String isExistRoleName(Map<String, Object> map);
}
