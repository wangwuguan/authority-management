package com.aaa.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.PageResult;
import com.aaa.entity.Person;
import com.aaa.service.IinformationService;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：InformationController   
 * 类描述： 单位信息和员工信息管理 
 * 创建人：王鹏翔  
 * 创建时间：2019年1月8日 下午8:58:37       
 */
@Controller
@RequestMapping("information")
public class InformationController {

	@Autowired
	private IinformationService inService;
	
	/**
	 * 跳转到单位账号信息查看页面
	 * @return
	 */
	@RequestMapping("toCompany")
	public String toCompany() {
		return "information/company";
	}
	
	/**
	 * 跳转到个人账号信息查看页面
	 * @return
	 */
	@RequestMapping("toPerson")
	public String toPerson() {
		return "information/person";
	}
	
	/**
	 * 跳转到单位账号信息修改日志查看页面
	 * @return
	 */
	@RequestMapping("toCompanyRecords")
	public String toCompanyRecords() {
		return "information/companyRecords";
	}
	
	/**
	 * 跳转到个人账号信息修改日志查看页面
	 * @return
	 */
	@RequestMapping("toPersonRecords")
	public String toPersonRecords() {
		return "information/personRecords";
	}
	
	/**
	 * 修改单位公积金账号信息
	 * @return
	 */
	@RequestMapping("updateCompany")
	@ResponseBody
	public String updateCompany(@RequestParam Map<String,Object> map) {
		return inService.updateCompany(map);
	}
	
	/**
	 * 修改个人公积金账号信息
	 * @return
	 */
	@RequestMapping("updatePerson")
	@ResponseBody
	public String updatePerson(@RequestParam Map<String,Object> map) {
		return inService.updatePerson(map);
	}
	
	/**
	 * 查询单位信息日志记录
	 * @param map
	 * @return
	 */
	@RequestMapping("selectCompanyCrecords")
	@ResponseBody
	public PageResult<Map> selectCompanyCrecords(@RequestParam Map<String,Object> map) {
		return inService.selectCompanyCrecords(map);
	}

	/**
	 * 查询个人信息日志记录
	 * @param map
	 * @return
	 */
	@RequestMapping("selectPersonCrecords")
	@ResponseBody
	public PageResult<Map> selectPersonCrecords(@RequestParam Map<String,Object> map) {
		return inService.selectPersonCrecords(map);
	}
	
}
