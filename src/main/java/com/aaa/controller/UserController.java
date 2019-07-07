package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.entity.User;
import com.aaa.service.IUserService;
import com.aaa.util.UserUtil;

/**
 * 项目名称：AccumulationFund   
 * 类名称：UserController   
 * 类描述：   后台管理员
 * 创建人：王鹏翔  
 * 创建时间：2018年12月27日 下午9:44:06   
 */
@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	/**
	 * 登录之后跳转菜单
	 * @return
	 */
	@RequestMapping("toMain")
	public String toMain(Model model) {
		//将登陆用户的信息传到后台页面
		/*model.addAttribute(UserUtil.getUser());*/
		return "backmain/main";
	}	
	
	/**
	 * 个人公积金登录之后跳转菜单
	 * @param model
	 * @return
	 */
	@RequestMapping("toFrontMainP")
	public String toFrontMainP(Model model) {
		return "front/personalMain";
	}
	
	/**
	 * 单位公积金登录之后跳转菜单
	 * @param model
	 * @return
	 */
	@RequestMapping("toFrontMainC")
	public String toFrontMainC(Model model) {
		return "front/companyMain";
	}
	
	/**
	 * 注销用户信息
	 * @return
	 */
	@RequestMapping("removeUser") 
	public String removerUser() {
		return userService.removeUser();
	}
	
	/**
	 * 前台注销
	 * @return
	 */
	@RequestMapping("removeFront") 
	public String removerFront() {
		return userService.removeFront();
	}
	
	/**
	 * 跳转到后台管理人员信息的展示页面
	 * @return
	 */
	@RequestMapping("toShowUser")
	public String toShowUser() {
		return "user/showUser";
	}
	
	/**
	 * 查询出所有用户的信息
	 * @return
	 */
	@RequestMapping("selectUser")
	@ResponseBody
	public PageResult<Map> selectUser(@RequestParam Map<String,Object> map) {
		return userService.selectUser(map);
	}
	
	/**
	 * 跳转到添加员工界面
	 * @return
	 */
	@RequestMapping("toAddUser")
	public String toAddUser(){
		return "user/addUser";
	}
	
	/**
	 * 添加新员工
	 * @return
	 */
	@RequestMapping("addUser")
	@ResponseBody
	public String addUser(User u) {
		return userService.addUser(u);
	} 
	
	/**
	 * 修改员工信息
	 * @return
	 */
	@RequestMapping("updateUser")
	@ResponseBody
	public String updateUser(User u) {
		return userService.updateUser(u);
	}
	
	/**
	 * 修改员工状态
	 * @return
	 */
	@RequestMapping("updateUserState")
	@ResponseBody
	public String updateUserState(User u) {
		return userService.updateUserState(u);
	}

	/**
	 * 跳转到员工修改密码界面
	 * @return
	 */
	@RequestMapping("toUpdatePsd")
	public String toUpdatePsd(Model model) {
		model.addAttribute("user", UserUtil.getUser());
		return "backmain/updateUserPsd";
	}
	
	/**
	 * 管理人员账号密码修改操作
	 * @return
	 */
	@RequestMapping("updateUserPsd")
	@ResponseBody
	public String updateUserPsd(@RequestParam Map<String, Object> map) {
		return userService.updateUserPsd(map);
	}
	
}
