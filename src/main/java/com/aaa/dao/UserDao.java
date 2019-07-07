package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.User;

/**
 * @author Administrator
 * @时间： 2018年12月27日
 */
public interface UserDao {

	/**
	 * 
	 */
	List<Map> selectUser(Map<String,Object> map);

	/**
	 * @return
	 */
	Integer getCount(Map<String,Object> map);

	/**
	 * @param u
	 * @return
	 */
	Integer addUser(User u);

	/**
	 * @return
	 */
	Integer selectUserLastUno();

	/**
	 * @param u
	 * @return
	 */
	Integer updateUser(User u);

	/**
	 * @param u
	 * @return
	 */
	Integer updateUserState(User u);

	/**
	 * @return
	 */
	Integer updateUserPsd(Map<String, Object> map);


}
