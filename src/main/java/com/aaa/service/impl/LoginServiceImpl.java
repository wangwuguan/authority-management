package com.aaa.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.LoginDao;
import com.aaa.entity.Company;
import com.aaa.entity.Person;
import com.aaa.entity.User;
import com.aaa.service.IloginService;
import com.aaa.util.SystemConstant;
import com.aaa.util.UserUtil;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：LoginService   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2018年12月28日 下午7:17:18       
 */
@Service
public class LoginServiceImpl implements IloginService{

	@Autowired
	private LoginDao loginDao;
	
	/**
	 * 根据登录人员输入的员工编号和密码
	 * 查询数据库中是否存在 进行登录验证
	 * 管理人员登录验证，员工状态和角色状态都为1("正常"、"已启用")
	 * @param uno 员工编号
	 * @param upassword 员工密码 
	 * @return
	 */
	@Override
	public String userLogin(Map<String,Object> map) { 
		User userSession = loginDao.userLogin(map);
		Person personSession = loginDao.personLogin(map);
		Company companySession = loginDao.companyLogin(map);
		//当userSession!=null时，证明数据库中有该员工信息 
		if (userSession!=null) {
			//将员工信息存储到session中去
			UserUtil.SaveUser(userSession);
			return SystemConstant.SUCCESS;
		} else if (personSession!=null) {
			//将登录人信息存储到session中去
			UserUtil.SavePerson(personSession);
			return SystemConstant.PERSON_SUCCESS;
		} else if (companySession!=null) {
			//将登录人信息存储到session中去
			UserUtil.SaveCompany(companySession);
			return SystemConstant.COMPANY_SUCCESS;
		}
		return SystemConstant.FAIL;
	}

}
