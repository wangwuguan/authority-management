package com.aaa.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：AuditDao   
 * 类描述：   
 * 创建人：
 * 创建时间：2019年1月9日 下午4:36:35       
 */

public interface AuditDao {
	/**
	 * 查询所有待审核状态的单位账户
	 *2019年1月16日 上午8:38:26
	 */
	@Select( "select * from company c inner join state s "
			+ "on c.stateid = s.sid "
			+ "inner join bank b on b.bid = c.cbank "
			+ "inner join certificate_type t on t.cetid = c.ccertificate "
			+ "where c.stateid = 1 "
			+ "limit #{page},#{limit}")
	List<Map> queryDepartmentInfor(Map<String, Object> map);
	/**
	 * 查询有几条数据 进行分页
	 *2019年1月16日 上午8:39:24
	 */
	@Select( "select count(*) from company c inner join state s "
			+ "on c.stateid = s.sid "
			+ "where c.stateid = 1 ")
	Integer getDepartmentInforCount(Map<String, Object> map);
	/**	
	 * 审核通过修改账户状态,并添加记录
	 *2019年1月16日 上午8:40:13
	 */
	@Update("update company set stateid = 2 where cno = #{cno}")
	Integer updStateDepartment(Map<String, Object> map);
	@Update("update companys set stateid = 2 where cno = #{cno}")
	Integer updStateDepartments(Map<String, Object> map);
	
	/**
	 * 申请被驳回，插入驳回理由
	 *2019年1月16日 上午8:41:51
	 */
	Integer insDepartmentRejectReason(Map<String, Object> map);
	
	/**
	 * 对单位审核页面进行模糊查询
	 * 
	 * 对查询的数据进行分页
	 *2019年1月16日 下午2:46:41
	 */
	List<Map> dimQueryDepartment(Map<String, Object> map);
	Integer dimQueryDepartmentCount(Map<String, Object> map);
	
	/**
	 * 查寻所有未审核状态的个人账号
	 * 
	 * 及其信息条数
	 *2019年1月16日 下午9:10:37
	 */
	List<Map> queryPersonalInfor(Map<String, Object> map);
	Integer queryPersonalInforCount(Map<String, Object> map);
	
	/**
	 * 修改个人账户的状态为通过
	 *2019年1月17日 上午9:34:27
	 */
	Integer updPersonalState(Map<String, Object> map);
	/**
	 * 插入个人驳回理由
	 *2019年1月17日 上午10:37:53
	 */
	Integer insPersonalRejectReason(Map<String, Object> map);
}























