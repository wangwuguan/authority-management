package com.aaa.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.PageResult;
import com.aaa.service.IAuditService;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：AuditController   
 * 类描述： 公积金审核管理  
 * 创建人：胡江鹏 
 * 创建时间：2019年1月9日 下午4:34:41       
 */
@Controller
@RequestMapping("audit")
public class AuditController {
	
	@Autowired
	private IAuditService auditService;
	
	/**
	 * 跳转到提取审核页面
	 * @return
	 */
	@RequestMapping("toExtractAudit")
	public String toExtract() {
		return "audit/extractAudit";
	}

	/** 
	 * 跳转单位审核页面
	 *2019年1月15日 下午8:19:55
	 */
	@RequestMapping("toAuditDepartment")
	public String toAuditDepartment(){
		return "audit/auditDepartment";
	}
	/**
	 * 查询所有的待审核的单位账户
	 *2019年1月16日 上午8:34:58
	 */
	@RequestMapping("queryDepartmentInfor")
	@ResponseBody
	public PageResult<Map> queryDepartmentInfor(@RequestParam Map<String , Object> map){
		return auditService.queryDepartmentInfor(map);
	}
	/**
	 * 审核通过，修改状态
	 *2019年1月16日 上午8:36:01
	 */
	@RequestMapping("updDepartment")
	@ResponseBody
	public String updDepartment(@RequestParam Map<String , Object> map){
		return auditService.updStateDepartment(map);		
	}
	/**
	 *审核未通过 添加驳回理由
	 *2019年1月16日 上午9:08:51
	 */
	@RequestMapping("insDepartmentRejectReason")
	@ResponseBody
	public String insRejectReason(@RequestParam Map<String, Object> map){
		return auditService.insDepartmentRejectReason(map);
	}
	/**
	 * 在单位审核页面添加模糊查询
	 *2019年1月16日 下午2:41:06
	 */
	@RequestMapping("dimQueryDepartment")
	@ResponseBody
	public PageResult<Map> dimQueryDepartment(@RequestParam Map<String , Object> map){
		return auditService.dimQueryDepartment(map);	
	}
	
	
	/** 
	 * 跳转个人账户审核页面
	 * 2019年1月15日 下午8:19:55
	 */
	@RequestMapping("toAuditPersonal")
	public String toAuditPersonal(){
		return "audit/auditPersonal";
	}
	
	/**
	 * 查询所有待审核状态的个人账户申请
	 *2019年1月16日 下午8:59:13
	 */
	@RequestMapping("queryPersonalInforByZero")
	@ResponseBody
	public PageResult<Map> queryPersonalInforByZero(@RequestParam Map<String, Object> map){
		map.put("pstateid", 0);//个人账户申请
		return auditService.queryPersonalInfor(map);
	}
	
	/** 
	 * 跳转人员转移审核页面
	 * 2019年1月15日 下午8:19:55
	 */
	@RequestMapping("toAuditPersonalByTwo")
	public String toAuditPersonalByTwo(){
		return "audit/auditTransfer";
	}
	/**
	 * 查询所有人员转移审核状态的个人账户申请
	 *2019年1月17日 下午4:32:35
	 */
	@RequestMapping("queryPersonalInforByTwo")
	@ResponseBody
	public PageResult<Map> queryPersonalInforByTwo(@RequestParam Map<String, Object> map){
		map.put("pstateid", 2);//人员转移审核
		System.out.println(map);
		return auditService.queryPersonalInfor(map);
	}
	
	/**
	 * 查询所有销号、启封、封存审核状态的个人账户申请
	 * 
	 *2019年1月17日 下午4:34:32
	 */
	@RequestMapping("queryPersonalInforByFour")
	@ResponseBody
	public PageResult<Map> queryPersonalInforByFour(@RequestParam Map<String, Object> map){
		map.put("pstateid", 4310);//销号、启封、封存审核
		System.out.println(map);
		return auditService.queryPersonalInfor(map);
	}
	/**
	 * 查询所有提取审核状态的个人账户申请
	 * 
	 *2019年1月17日 下午4:34:48
	 */
	@RequestMapping("queryPersonalInforByEleven")
	@ResponseBody
	public PageResult<Map> queryPersonalInforByEleven(@RequestParam Map<String, Object> map){
		map.put("pstateid", 11);//提取审核
		System.out.println(map);
		return auditService.queryPersonalInfor(map);
	}
	
	
	
	/** 
	 * 跳转人员销户、启封、封存审核页面
	 * 2019年1月15日 下午8:19:55
	 */
	@RequestMapping("toKeepingSealOrOpenAudit")
	public String toKeepingSealOrOpenAudit(){
		return "audit/KeepingSealOrOpenAudit";
	}

	
	/**
	 * 个人账号审核通过
	 * 并修改其状态
	 *2019年1月17日 下午7:11:55
	 */
	@RequestMapping("updPersonalState")
	@ResponseBody
	public String updPersonalState(@RequestParam Map<String, Object> map){
		return auditService.updPersonalState(map);
	}
	
	/**
	 *审核未通过 添加驳回理由
	 *2019年1月16日 上午9:08:51
	 */
	@RequestMapping("insPersonalRejectReason")
	@ResponseBody
	public String insPersonalRejectReason(@RequestParam Map<String, Object> map){
		return auditService.insPersonalRejectReason(map);
	}
	
	
	
	
	
}



























