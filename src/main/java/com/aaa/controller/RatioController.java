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
import com.aaa.entity.Person;
import com.aaa.service.IRatioService;

@Controller
@RequestMapping("ratio")
public class RatioController {
	@Autowired
	private IRatioService raService;
	/**
	 * 修改单位和个人缴存比例
	 * @param c
	 * @return
	 */
	@RequestMapping("/updateRatio")
	@ResponseBody
	public String updateRatio(Company c){
		return raService.updateRatio(c);            
	}
	/**
	 * 修改个人的缴存基数
	 * @param p
	 * @return
	 */
	@RequestMapping("/updateBaseNum") 
	@ResponseBody
	public String updateBaseNum(Person p){
		return raService.updateBaseNum(p);
	}
	
	/**
	 * 查询修改基数页面
	 */
	@RequestMapping("selectPersonPid")
	@ResponseBody
	public PageResult<Map> selectPersonPid(@RequestParam Map<String,Object> map) {
		
		return raService.selectPersonPid(map);
	}
	/**
	 * 修改基数跳转页面
	 */
	@RequestMapping("toSelectPersonPid")
	public String toSelectPersonPid(Company c,Model model){
		model.addAttribute(c);
		return "company/BaseNum";
	}
}
