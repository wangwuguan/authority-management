package com.aaa.service;

import com.aaa.entity.Menu;
import com.aaa.entity.MenuTree;
import com.aaa.entity.Role;
import com.aaa.entity.TreeTable;

import java.util.List;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：IMenuService   
 * 类描述：   
 * 创建人：will.Wang
 * 创建时间：2018年12月28日 上午9:25:46       
 */

public interface IMenuService {

	/**
	 * @return
	 */
	List<Menu> selectMenuOne();

	/**
	 * @param id
	 * @return
	 */
	List<Menu> selectMenuTwo(Integer id);

	/**
	 * @return
	 */
	List<MenuTree> selectMenuTree(Role r);

	/**
	 * @return
	 */
	TreeTable<Menu> selectMenus(Map<String,Object> map);

	/**
	 * @param m
	 * @return
	 */
	String addMenu(Menu m);

	/**
	 * @param m
	 * @return
	 */
	String delMenu(Menu m);

	/**
	 * @param m
	 * @return
	 */
	String updateMenu(Menu m);

	/**
	 * @param m
	 * @return
	 */
	String isExistMenuName(Menu m);

}
