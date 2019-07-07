package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.PageResult;
import com.aaa.service.IComboboxService;

@Controller
@RequestMapping("combobox")
public class ComboboxController {
	@Autowired
	private IComboboxService boxService;
	/**
	 * 查询证件类型
	 * @param map
	 * @return
	 */
	@RequestMapping("selectCertificate")
	@ResponseBody
	public List<Map> selectCertificate() {
		return boxService.selectCertificate();
	}
	/**
	 * 查询公司类型
	 * @param map
	 * @return
	 */
	@RequestMapping("selectCompanyType")
	@ResponseBody
	public List<Map> selectCompanyType() {
		return boxService.selectCompanyType();
	}
	/**
	 * 查询所属行业
	 * @param map
	 * @return
	 */
	@RequestMapping("selectIndustry")
	@ResponseBody
	public List<Map> selectIndustry() {
		return boxService.selectIndustry();
	}
	/**
	 * 隶属关系
	 * @param map
	 * @return
	 */
	@RequestMapping("selectRelation")
	@ResponseBody
	public List<Map> selectRelation() {
		return boxService.selectRelation();
	}
	/**
	 * 经济类型
	 * @param map
	 * @return
	 */
	@RequestMapping("selectEconomicType")
	@ResponseBody
	public List<Map> selectEconomicType() {
		return boxService.selectEconomicType();
	}
	/**
	 * 开户银行
	 * @param map
	 * @return
	 */
	@RequestMapping("selectBank")
	@ResponseBody
	public List<Map> selectBank() {
		return boxService.selectBank();
	}
	/**
	 * 学历
	 * @return
	 */
	@RequestMapping("selectDegree")
	@ResponseBody
	public 	List<Map> selectDegree(){
		return boxService.selectDegree();
	}
	/**
	 * 公积金提取原因
	 * @return
	 */
	@RequestMapping("selectFund")
	@ResponseBody
	public List<Map> selectFund(){
		return boxService.selectFund();
	}
	/**
	 * 约定提取时间
	 */
	@RequestMapping("selectAgreedTime")
	@ResponseBody
	public List<Map> selectAgreedTime(){
		return boxService.selectAgreedTime();
	}
}
