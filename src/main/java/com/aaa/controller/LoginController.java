package com.aaa.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.User;
import com.aaa.service.IloginService;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：LoginController   
 * 类描述： 用于前后台人员登录、注销账号使用 
 * 创建人：王鹏翔  
 * 创建时间：2018年12月28日 下午6:36:27       
 */
@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	private IloginService loginService;
	
	/**
	 * 跳转到管理员登录界面
	 * @return 
	 */
	@RequestMapping("toBackLogin")
	public String toBackLogin() {
		return "backmain/login";
	}
	
	
	/**
	 * 后台登录验证
	 * @param uno 管理员编号
	 * @param upassword 管理员密码
 	 * @return
	 */
	@RequestMapping("userLogin")
	@ResponseBody
	public String userLogin(@RequestParam Map<String,Object> map) {
		return loginService.userLogin(map);
	}
	
}
