package com.aaa.service;

import java.util.Map;


/**      
 * 项目名称：AccumulationFund   
 * 类名称：IloginService   
 * 类描述：  前后台登录管理 
 * 创建人：will.Wang
 * 创建时间：2018年12月28日 下午7:16:00       
 */
public interface IloginService {

	/**
	 * @param uno
	 * @param upassword
	 * @return
	 */
	String userLogin(Map<String,Object> map);

}
