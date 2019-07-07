 package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Role;
import org.apache.ibatis.annotations.Mapper;

 /**
 * 项目名称：AccumulationFund   
 * 类名称：RoleDao   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2019年1月2日 下午4:13:50       
 */
public interface RoleDao {

	/**
	 * 
	 * @param map
	 * @return
	 */
	List<Map> selectRole(Map map);

	/**
	 * @param map
	 * @return
	 */
	int getCount(Map map);

	/**
	 * @return
	 */
	List<Map> selectRoleAll();

	/**
	 * @param r
	 * @return
	 */
	int addRole(Role r);

	/**
	 * @param r
	 * @return
	 */
	int updateRole(Role r);

	/**
	 * @param r
	 * @return
	 */
	int updateRoleState(Role r);

	/**
	 * @param map
	 * @return
	 */
	int accreditRoleT(Map map);
	
	/**
	 * @param map
	 * @return
	 */
	int accreditRoleF(Map map);

	/**
	 * @return
	 */
	Integer selectMaxRoleId();

	/**
	 * @param map
	 * @return
	 */
	int addRoleMenu(Map<String, Object> map);

	/**
	 * @param lists
	 * @return
	 */
	List<Integer> selectOneByTwos(List<Integer> list);

	/**
	 * @return
	 */
	List<Integer> selectMenuIds();

	/**
	 * @param map
	 * @return
	 */
	Role isExistRoleName(Map<String, Object> map);
	
	
}
