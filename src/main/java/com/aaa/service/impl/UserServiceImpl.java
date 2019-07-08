package com.aaa.service.impl;

import com.aaa.dao.UserDao;
import com.aaa.entity.PageResult;
import com.aaa.entity.User;
import com.aaa.service.IUserService;
import com.aaa.util.PageUtil;
import com.aaa.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：UserServiceImpl   
 * 类描述：后台管理员登录注销
 * 创建人：will.Wang
 * 创建时间：2018年12月27日 下午9:45:10
 */
@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserDao userDao;

	/**
	 * 注销当前登录人信息
	 * @return
	 */
	@Override
	public String removeUser() {
		return UserUtil.removeUser();
	}

	/**
	 * 查询出来所有用户信息
	 * 并跳转到显示页面
	 * @return
	 */
	@Override
	public PageResult<Map> selectUser(Map<String,Object> map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//返回数据
		return PageUtil.selectResult(userDao.getCount(map), userDao.selectUser(map));		
	}

	/**
	 * 添加新角色
	 * @param u
	 * @return
	 */
	@Override
	public String addUser(User u) {
		//查询出数据库中员工编号最大的值
		u.setUno(userDao.selectUserLastUno());
		//进行员工添加操作
		return PageUtil.toResult(userDao.addUser(u));
	}

	/**
	 * 修改角色信息
	 * @param u 
	 * @return
	 */
	@Override
	public String updateUser(User u) {
		return PageUtil.toResult(userDao.updateUser(u));	
	}

	/**
	 * 修改角色状态为
	 * @param u
	 * @return
	 */
	@Override
	public String updateUserState(User u) {
		return PageUtil.toResult(userDao.updateUserState(u));
	}

	/**
	 * 前台注销
	 * @return
	 */
	@Override
	public String removeFront() {
		return UserUtil.removeFront();
	}

	/**
	 * 管理人员账号密码修改操作
	 * @param map
	 * @return
	 */
	@Override
	public String updateUserPsd(Map<String, Object> map) {
		//获取当前登录人id
		User user = UserUtil.getUser();
		map.put("uid", user.getUid());
		return PageUtil.toResult(userDao.updateUserPsd(map));
	}

}
