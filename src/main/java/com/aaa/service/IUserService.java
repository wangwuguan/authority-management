package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.PageResult;
import com.aaa.entity.User;

/**
 * @author Administrator
 * @时间： 2018年12月27日
 */
public interface IUserService {

	/**
	 * @return
	 */
	String removeUser();

	/**
	 * @return
	 */
	PageResult<Map> selectUser(Map<String,Object> map);

	/**
	 * @param u
	 * @return
	 */
	String addUser(User u);

	/**
	 * @param u
	 * @return
	 */
	String updateUser(User u);

	/**
	 * @param u
	 * @return
	 */
	String updateUserState(User u);

	/**
	 * @return
	 */
	String removeFront();

	/**
	 * @param map
	 * @return
	 */
	String updateUserPsd(Map<String, Object> map);

	
}
