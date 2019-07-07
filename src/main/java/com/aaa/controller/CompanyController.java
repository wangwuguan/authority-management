package com.aaa.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.service.ICompanyService;
import com.aaa.util.PageUtil;

@Controller
@RequestMapping("company")
public class CompanyController {
	@Autowired
	private ICompanyService comService;
	/**
	 * 公司开户提交按钮
	 * @param c
	 * @return
	 */
	@RequestMapping("/addCompany")
	public String addCompany(Company c){
		int i = comService.insertCompany(c);	
		return "redirect:toOpenRecord";
	}
	/**
	 * 跳转公司开户页面
	 */
	@RequestMapping("/toAddCompany")
	public String toAddCompany(){
		return "company/comShow";
	}
	/**
	 * 跳转开户记录
	 */
	@RequestMapping("/toOpenRecord")
	public String openRecord(){
		return "company/openRecord";
	}
	
	/**
	 * 查询公司
	 */
	@RequestMapping("selectCompany")
	@ResponseBody
	public PageResult<Map> selectCompany(@RequestParam Map<String,Object> map) {
		return comService.selectCompany(map);
	}
	
	/**
	 * 跳转比例变更
	 */
	@RequestMapping("/toUpdateRatio")
	public String toUpdateRatio(){
		return "company/updateRatio";
	}
	/**
	 * 跳转基数调整                                                                                                                                                                                                                                                                                                                                                                     
	 */
	@RequestMapping("/toUpdateCardinal")
	public String toUpdateCardinal(){
		return "company/updateCardinal";
	}
	
	/**
	 * 跳转基数调整                                                                                                                                                                                                                                                                                                                                                                     
	 */
	@RequestMapping("/toBaseNum")
	public String toBaseNum(){
		return "company/baseNum";
	}
	/**
	 * 跳转查看详情页面
	 */
	@RequestMapping("toCompanyInfoById")
	public String toCompanyInfoById(Integer cid,Model model){
		model.addAttribute("company",comService.selectCompanyInfoById(cid));
		return "company/companyInfo";
	}
	/**
	 * 跳转变更记录                                                                                                                                                                                                                                                                                                                                                                  
	 */
	@RequestMapping("/toChangeRatio")
	public String toRatioChange(){
		return "company/changeRatio";
	}
	/**
	 * 跳转明细查询                                                                                                                                                                                                                                                                                                                                                                  
	 */
	@RequestMapping("/toSelectDetail")
	public String toSelectDetail(){
		return "company/showDetail";
	}
	/**
	 * 查询机构代码
	 */
	@RequestMapping("/selectInstitution")
	@ResponseBody
	public String selectInstitution(@RequestParam Map<String,Object> map){
		return comService.selectInstitution(map);
	}
	/**
	 * 查询公司开户记录
	 */
	@RequestMapping("selectCompanys")
	@ResponseBody
	public PageResult<Map> selectCompanys(@RequestParam Map<String,Object> map) {
		return comService.selectCompanys(map);
	}
}
