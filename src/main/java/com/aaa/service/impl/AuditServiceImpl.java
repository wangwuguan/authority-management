package com.aaa.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.AuditDao;
import com.aaa.entity.PageResult;
import com.aaa.service.IAuditService;
import com.aaa.util.PageUtil;
import com.aaa.util.Records;
import com.aaa.util.SystemConstant;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：AuditServiceImpl   
 * 类描述：   
 * 创建人：
 * 创建时间：2019年1月9日 下午4:37:34       
 */
@Service
public class AuditServiceImpl implements IAuditService {
	
	@Autowired
	private AuditDao auditDao;
	
	/**
	 * 返回的是分页类，查询所有的待审核单位账户
	 * AuditServiceImpl.java
	 * TODO
	 * @param map
	 * @return
	 *
	 */
	public PageResult<Map> queryDepartmentInfor(Map<String , Object> map){
		//对map进行处理
		PageUtil.pageMap(map);
		//创建一个返回类型
		return PageUtil.selectResult(auditDao.getDepartmentInforCount(map),auditDao.queryDepartmentInfor(map));
	}
	
	/**
	 * 审核通过 修改状态
	 * AuditServiceImpl.java
	 * TODO
	 * @param map
	 * @return
	 *
	 */
	@Override
	public String updStateDepartment(Map<String, Object> map) {		
		Integer i = auditDao.updStateDepartment(map);
		auditDao.updStateDepartments(map);//插入记录表
		map.put("rcmsg", "单位账户审核通过");
		//添加操作记录到记录表中,这里的i判断是否成功是在封装类中
		return Records.createCompanyCrecords(i, map, SystemConstant.OPEN_AUDIT);
	}
	/**
	 *审核没有通过，添加驳回原因
	 *2019年1月16日 上午8:45:32
	 */
	public String insDepartmentRejectReason(Map<String, Object> map){
		Integer i = auditDao.insDepartmentRejectReason(map);
		map.put("rcmsg", "单位审核被驳回");
		//添加操作记录到记录表中，这里的i判断是否成功是在封装类中
		return Records.createCompanyCrecords(i , map , SystemConstant.OPEN_AUDIT);
	}
	/**
	 * 在单位审核页面添加模糊查询
	 *2019年1月16日 下午2:42:10
	 */
	public PageResult<Map> dimQueryDepartment(Map<String, Object> map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//创建一个返回类型
		return PageUtil.selectResult(auditDao.dimQueryDepartmentCount(map),auditDao.dimQueryDepartment(map));
	}
	
	
	/**
	 * 查询所有未审核的个人账户
	 * 并分页包括模糊查询
	 * AuditServiceImpl.java
	 * TODO
	 * @param map
	 * @return
	 *
	 */
	public PageResult<Map> queryPersonalInfor(Map<String , Object> map){
		//对map进行处理
		PageUtil.pageMap(map);
		//创建一个返回类型
		return PageUtil.selectResult(auditDao.queryPersonalInforCount(map),auditDao.queryPersonalInfor(map));
	}

	/**
	 * 修改个人账户状态通过
	 * 并添加操作记录
	 * AuditServiceImpl.java
	 * TODO
	 * @param map
	 * @return
	 *
	 */
	public String updPersonalState(Map<String, Object> map) {
		Integer updPersonalState = auditDao.updPersonalState(map);
		Integer state = Integer.parseInt(map.get("pstateid").toString());
		//添加操作记录
		if(state == SystemConstant.PERSONAL_WAIT_AUDIT){//0
			map.put("rcmsg", "个人账户审核通过");
		}else if(state == SystemConstant.PERSONAL_TRANSFER){//2
			map.put("rcmsg", "人员转移成功");
		}else if(state == SystemConstant.CLOSING_ACCOUNT){//10
			map.put("rcmsg", "封存成功");
		}else if(state == SystemConstant.OPEN_ACCOUNTS){//3
			map.put("rcmsg", "启封成功");
		}else if(state == SystemConstant.WAIT_CLOSE_ACCOUNT){//4
			map.put("rcmsg", "销号成功");
		}else if(state == SystemConstant.EXTRACTING_WAIT_AUDIT){//11
			map.put("rcmsg", "提取公积金成功");
		}
		return Records.createPersonCrecords(updPersonalState, map, SystemConstant.OPEN_AUDIT);
	}
	
	/**
	 *审核没有通过，添加驳回原因
	 *2019年1月16日 上午8:45:32
	 */
	public String insPersonalRejectReason(Map<String, Object> map){
		Integer i = auditDao.insPersonalRejectReason(map);
		Integer state = Integer.parseInt(map.get("pstateid").toString());
		//添加操作记录
		if(state == SystemConstant.PERSONAL_WAIT_AUDIT){//0
			map.put("rcmsg", "个人账户审核失败");
		}else if(state == SystemConstant.PERSONAL_TRANSFER){//2
			map.put("rcmsg", "人员转移失败");
		}else if(state == SystemConstant.CLOSING_ACCOUNT){//10
			map.put("rcmsg", "封存失败");
		}else if(state == SystemConstant.OPEN_ACCOUNTS){//3
			map.put("rcmsg", "启封失败");
		}else if(state == SystemConstant.WAIT_CLOSE_ACCOUNT){//4
			map.put("rcmsg", "销号失败");
		}else if(state == SystemConstant.EXTRACTING_WAIT_AUDIT){//11
			map.put("rcmsg", "提取公积金失败");
		}
		//添加操作记录到记录表中，这里的i判断是否成功是在封装类中
		return Records.createCompanyCrecords(i , map , SystemConstant.OPEN_AUDIT);
	}

}





















