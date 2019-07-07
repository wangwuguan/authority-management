package com.aaa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.MenuDao;
import com.aaa.dao.RoleDao;
import com.aaa.dao.UserDao;
import com.aaa.entity.Menu;
import com.aaa.entity.MenuTree;
import com.aaa.entity.Role;
import com.aaa.entity.TreeTable;
import com.aaa.entity.User;
import com.aaa.service.IMenuService;
import com.aaa.util.PageUtil;
import com.aaa.util.SystemConstant;
import com.aaa.util.UserUtil;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：MenuServiceImpl   
 * 类描述：  菜单管理 
 * 创建人：王鹏翔  
 * 创建时间：2018年12月28日 上午9:26:04       
 */
@Service
@Transactional //事务处理
public class MenuServiceImpl implements IMenuService{

	@Autowired
	private MenuDao menuDao;

	/**
	 * 根据登录人角色权限
	 * 查询所有的一级菜单
	 * @return
	 */
	@Override
	public List<Menu> selectMenuOne() {
		//获取当前登录人信息
		User user = UserUtil.getUser();		
		return menuDao.selectMenuOne(user);
	}

	/**
	 * 根据一级菜单id 和登录人角色信息
	 * 查询出来其下的二级菜单
	 * @param id 一级菜单id
	 * @return
	 */
	@Override
	public List<Menu> selectMenuTwo(Integer id) {
		//获取当前登录人信息
		User user = UserUtil.getUser();
		Map<String,Object> map = new HashMap<>();
		map.put("id", id);
		map.put("user", user);
		return menuDao.selectMenuTwo(map);
	}

	/**
	 * 获取菜单的树性结构及复选框
	 * @return
	 */
	@Override
	public List<MenuTree> selectMenuTree(Role r) {
		//定义一个返回的类型
		List<MenuTree> menuTrees = new ArrayList<>();
		//获取一级菜单结构
		List<Menu> MenuOne = menuDao.selectMenuOneAll();
		for (Menu menuOne : MenuOne) {
			//获取一级菜单
			MenuTree menuTreeOne = new MenuTree();
			menuTreeOne.setTitle(menuOne.getMname());
			menuTreeOne.setValue(menuOne.getMid().toString());
			//当一级菜单下有二级菜单时
			if (menuOne.getMfather()==0) {
				Map<String,Object> map = new HashMap<>();
				map.put("rid", r.getRid());
				map.put("mid", menuOne.getMid());
				//查询角色对应的二级菜单
				List<Menu> menuTwos = menuDao.selectMenuTwos(map);
				List<MenuTree> menuTree = new ArrayList<>();
				//遍历出所有的二级菜单
				for (Menu menuTwo : menuTwos) {
					MenuTree menuTreeTwo = new MenuTree();
					menuTreeTwo.setTitle(menuTwo.getMname());
					menuTreeTwo.setValue(menuTwo.getMid().toString());
					//已选中的二级菜单
					if (menuTwo.getRmstate()==1) {
						menuTreeTwo.setChecked(true);
					}
					//添加二级菜单
					menuTree.add(menuTreeTwo);
				}
				//添加一级菜单
				menuTreeOne.setData(menuTree);
			}
			menuTrees.add(menuTreeOne);
		}
		return menuTrees;
	}

	/**
	 * 查询所有菜单 page=1, limit=10
	 * @return
	 */
	@Override
	public TreeTable<Menu> selectMenus(Map<String,Object> map) {
		//创建新的返回类型（对应树形表格）
		TreeTable<Menu> treeTable = new TreeTable<>();
		//为返回值类型赋值
		treeTable.setData(menuDao.selectMenus(map));
		treeTable.setCount(menuDao.getMenusCount(map));
		return treeTable;
	}

	/**
	 * 添加菜单
	 * @param m
	 * @return
	 */
	@Override
	public String addMenu(Menu m) {
		//查询出来最大的mid(加一)
		Integer mid = menuDao.getMaxMenuId();
		//为新添加的菜单id赋值
		m.setMid(mid);
		//查询出所有的角色id
		List<Integer> rids = menuDao.selectRoleIds();
		Map<String,Object> map = new HashMap<>();
		map.put("rids",rids);
		map.put("mid",mid);
		//将菜单插入到菜单-角色对应表中(超管"菜单状态默认选中")
		menuDao.addMenuRoleMain(map);
		//将菜单插入到菜单-角色对应表中("菜单状态为选中")
		menuDao.addMenuRole(map);
		//添加新菜单
		return PageUtil.toResult(menuDao.addMenu(m));
	}

	/**
	 * 删除菜单
	 * @param m
	 * @return
	 */
	@Override
	public String delMenu(Menu m) {
		//删除菜单-角色对应表中的菜单
		menuDao.delMenuRole(m);
		if (m.getMfather()==0) {
			//如果是一级菜单 查询出一级菜单下的所有子菜单mid集合
			List<Integer> mids = menuDao.selectMenusByMfather(m);
			Menu menuT = new Menu();
			//遍历一级菜单下的二级菜单mid
			for (Integer mid : mids) {		
				menuT.setMid(mid);
				//删除菜单表中一级菜单的信息
				menuDao.delMenu(menuT);
				//删除一级菜单对应的菜单-角色对应表中的数据
				menuDao.delMenuRole(menuT);
			}
		}
		return PageUtil.toResult(menuDao.delMenu(m));
	}

	/**
	 * 修改信息
	 * @param m
	 * @return
	 */
	@Override
	public String updateMenu(Menu m) {
		return PageUtil.toResult(menuDao.updateMenu(m));
	}

	/**
	 * 菜单名的唯一性验证
	 * @param m
	 * @return
	 */
	@Override
	public String isExistMenuName(Menu m) {
		Menu menu = menuDao.isExistMenuName(m);
		if (menu==null) {
			return SystemConstant.SUCCESS;
		}
		return SystemConstant.FAIL;
	}

	
	
}
