package com.aaa.dao;

import com.aaa.entity.Menu;
import com.aaa.entity.Role;
import com.aaa.entity.User;

import java.util.List;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：MenuDao   
 * 类描述： dao的接口类  
 * 创建人：will.Wang
 * 创建时间：2018年12月28日 上午9:25:25       
 */
public interface MenuDao {
	
	/**
	 * @return
	 */
	List<Menu> selectMenus(Map<String,Object> map);
	
	/** 
	 * @return
	 */
	Integer getMenusCount(Map<String,Object> map);

	/**
	 * @return
	 */
	List<Menu> selectMenuOneAll();
	
	/**
	 * @return
	 */
	List<Menu> selectMenuOne(User u);

	/**
	 * @param id
	 * @return
	 */
	List<Menu> selectMenuTwo(Map<String,Object> map);
	
	/**
	 * @param id
	 * @return
	 */
	List<Menu> selectMenuTwos(Map<String,Object> map);

	/**
	 * @param r
	 * @return
	 */
	List<Menu> selectMenuByRid(Role r);
	
	/**
	 * 
	 * @return
	 */
	Integer getMaxMenuId();

	/**
	 * @return
	 */
	Integer addMenuOne();

	/**
	 * @param m
	 * @return
	 */
	Integer addMenu(Menu m);
	
	/**
	 * 
	 * @return
	 */
	List<Integer> selectRoleIds();
	
	/**
	 * 
	 * @return
	 */
	Integer addMenuRole(Map<String,Object> map);
	
	/**
	 * 
	 * @return
	 */
	Integer addMenuRoleMain(Map<String,Object> map);

	/**
	 * @param m
	 * @return
	 */
	Integer delMenu(Menu m);
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	Integer delMenuRole(Menu m);

	/**
	 * @param m
	 * @return
	 */
	Integer updateMenu(Menu m);

	/**
	 * @param m
	 * @return
	 */
	List<Integer> selectMenusByMfather(Menu m);

	/**
	 * @param m
	 * @return
	 */
	Menu isExistMenuName(Menu m);	
 
}
