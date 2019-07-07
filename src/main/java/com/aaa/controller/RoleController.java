package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.PageResult;
import com.aaa.entity.Role;
import com.aaa.entity.Role;
import com.aaa.service.IRoleService;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：RoleController   
 * 类描述： 角色管理
 * 创建人：王鹏翔  
 * 创建时间：2019年1月2日 下午4:13:05       
 */

@Controller
@RequestMapping("role")
public class RoleController {

	@Autowired
	private IRoleService roleService;
	
	/**
	 * 查询角色信息
	 * @return
	 */
	@RequestMapping("selectRoleAll")
	@ResponseBody
	public List<Map> selectRoleAll(){
		return roleService.selectRoleAll();
	}
	
	/**
	 * 跳转到角色展示页面
	 * @return
	 */
	@RequestMapping("toShowRole")
	public String toShowRole() {
		return "role/showRole";
	}
	
	/**
	 * 查询角色信息(展示页面)
	 * @return
	 */
	@RequestMapping("selectRole")
	@ResponseBody
	public PageResult<Map> selectRole(@RequestParam Map<String,Object> map){
		return roleService.selectRole(map);
	}
	
	/**
	 * 跳转到添加新角色页面
	 * @return
	 */
	@RequestMapping("toAddRole")
	public String toAddRole() {
		return "role/addRole";
	}
	
	/**
	 * 添加新角色
	 * @return
	 */
	@RequestMapping("addRole")
	@ResponseBody
	public String addRole(Role r) {
		return roleService.addRole(r);
	}
	
	/**
	 * 修改员工信息
	 * @return
	 */
	@RequestMapping("updateRole")
	@ResponseBody
	public String updateRole(Role r) {
		return roleService.updateRole(r);
	}
	
	/**
	 * 修改员工状态
	 * @return
	 */
	@RequestMapping("updateRoleState")
	@ResponseBody
	public String updateRoleState(Role r) {
		return roleService.updateRoleState(r);
	}
	
	/**
	 * 跳转到角色授权页面
	 * @return
	 */
	@RequestMapping("toAccreditRole")
	public String toAccreditRole() {
		return "role/accreditRole";
	}
	
	/**
	 * 角色权限赋值
	 * @return
	 */
	@RequestMapping("accreditRole")
	@ResponseBody
	public String accreditRole(@RequestParam Map<String,Object> map) {
		return roleService.accreditRole(map);
	}
	
	/**
	 * 查询角色名是否存在
	 * @param map
	 * @return
	 */
	@RequestMapping("isExistRoleName")
	@ResponseBody
	public String isExistRoleName(@RequestParam Map<String,Object> map) {
		return roleService.isExistRoleName(map);
	}
}
