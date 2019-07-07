package com.aaa.service;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.aaa.entity.PageResult;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：IAuditService   
 * 类描述：   
 * 创建人：胡江鹏  
 * 创建时间：2019年1月9日 下午4:37:02       
 */

public interface IAuditService {
	/**
	 * 查询出所有待审核的单位公积金账户
	 *2019年1月15日 下午8:46:50
	 */
	PageResult<Map> queryDepartmentInfor(Map<String , Object> map);
	
	/**
	 *审核-修改单位公基金账户的状态
	 *2019年1月15日 下午8:53:32
	 */
	String updStateDepartment(Map<String , Object> map);
	/**
	 * 审核未通过  添加驳回理由
	 *2019年1月16日 上午9:05:53
	 */
	String insDepartmentRejectReason(Map<String, Object> map);
	
	/**
	 * 在单位审核页面添加模糊查询
	 *2019年1月16日 下午2:42:10
	 */
	PageResult<Map> dimQueryDepartment(Map<String , Object> map);
	
	/**
	 * 查询所有未审核状态的个人账户
	 *2019年1月16日 下午10:10:42
	 */
	PageResult<Map> queryPersonalInfor(Map<String , Object> map);
	
	/**
	 * 修改个人账户状态-审核通过
	 *2019年1月17日 上午9:23:04
	 */
	String updPersonalState(Map<String, Object> map);
	/**
	 * 个人审核未通过，插入驳回理由
	 *2019年1月17日 上午10:56:02
	 */
	String insPersonalRejectReason(Map<String, Object> map);
}














