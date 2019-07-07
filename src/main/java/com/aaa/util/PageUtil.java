package com.aaa.util;

import java.util.List;
import java.util.Map;

import com.aaa.entity.PageResult;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：PageUtil   
 * 类描述： 关于前台显示分页处理  
 * 创建人：王鹏翔  
 * 创建时间：2019年1月1日 下午4:19:27       
 */
public class PageUtil {

	/**
	 * 分页中对map进行处理
	 * @param map
	 * @return
	 */
	public static Map<String,Object> pageMap(Map<String,Object> map) {
		//获取map里面的参数值
		Integer page =  Integer.parseInt(map.get("page").toString()) ;
		Integer limit =  Integer.parseInt(map.get("limit").toString());
		//为map重新赋值
		page = (page-1)*limit; 
		map.put("page", page);
		map.put("limit",limit);
		return map;
	}
	
	/**
	 * layui返回值处理
	 * 与layui 分页接口对应
	 * @param count 查询数据的长度
	 * @param list 查询的数据的list<Map>集合
	 * @return
	 */
	public static PageResult<Map> selectResult(Integer count, List<Map> list){
		//创建一个返回类型
		PageResult<Map> userPage = new PageResult<Map>();
		//赋值数据长度
		userPage.setCount(count);
		//赋值数据列表
		userPage.setData(list);
		return userPage;
	}
	
	/**
	 * 增删改返回值调用
	 * @param i 受影响的行数
	 */
	public static String toResult(int i) {
		if (i > 0) {
			//证明添加成功
			return SystemConstant.SUCCESS;
		}
		return SystemConstant.FAIL;
	}
	
	
	
}
