package com.aaa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Menu;
import com.aaa.entity.MenuTree;
import com.aaa.entity.Role;
import com.aaa.entity.TreeTable;
import com.aaa.service.IMenuService;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：MenuController   
 * 类描述： 获取登录人菜单权限 
 * 创建人：王鹏翔  
 * 创建时间：2018年12月28日 上午9:23:27       
 */
@Controller
@RequestMapping("menu")
public class MenuController {
	
	@Autowired
	private IMenuService menuService;
	
	/**
	 * 跳转到菜单展示页面
	 * @return
	 */
	@RequestMapping("toShowMenu")
	public String toShowMenu() {
		return "menu/showMenu";
	}
	
	/**
	 * 查询所有的菜单
	 */
	@RequestMapping("selectMenus")
	@ResponseBody
	public TreeTable<Menu> selectMenus(@RequestParam Map<String,Object> map) {
		return menuService.selectMenus(map);
	}
	
	/**
	 * 查询出来一级菜单
	 */
	@RequestMapping("menuOne")
	@ResponseBody
	public List<Menu> selectMenuOne() {
		return menuService.selectMenuOne();
	}
	
	/**
	 * 查询出来二级菜单
	 */
	@RequestMapping("menuTwo")
	@ResponseBody
	public List<Menu> selectMenuTwo(Integer id) {
		return menuService.selectMenuTwo(id);
	}	

	/**
	 * 获取菜单的树性结构及复选框
	 * @return
	 */
	@RequestMapping("menuTree")
	@ResponseBody
	public List<MenuTree> selectMenuTree(Role r) {
		return menuService.selectMenuTree(r);
	}
	
	/**
	 * 跳转到一级菜单添加页面
	 * @return
	 */
	@RequestMapping("toAddMenuOne")
	public String toAddMenuOne() {
		return "menu/addMenuOne";
	}
	
	/**
	 * 添加菜单
	 * @param m
	 * @return
	 */
	@RequestMapping("addMenu")
	@ResponseBody
	public String addMenu(Menu m) {
		return menuService.addMenu(m);
	}
	
	/**
	 * 删除菜单
	 * @param m
	 * @return
	 */
	@RequestMapping("delMenu")
	@ResponseBody
	public String delMenu(Menu m) {
		return menuService.delMenu(m);
	}
	
	/**
	 * 修改菜单信息
	 * @param m
	 * @return
	 */
	@RequestMapping("updateMenu")
	@ResponseBody
	public String updateMenu(Menu m) {
		return menuService.updateMenu(m);
	}
	
	/**
	 * 菜单名唯一性验证
	 * @param m
	 * @return
	 */
	@RequestMapping("isExistMenuName")
	@ResponseBody
	public String isExistMenuName(Menu m) {
		return menuService.isExistMenuName(m);
	}
}
