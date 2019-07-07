package com.aaa.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.aaa.entity.PageResult;
import com.aaa.entity.Person;
import com.aaa.entity.TakeFund;
import com.aaa.service.ITakeFoundService;

@Controller
@RequestMapping("takeFund")
public class TakeFoundController {
	@Autowired
	private ITakeFoundService takeFoundService;
	
	/**
	 * 转到提取界面
	 * @return
	 */
	@RequestMapping("toTakeFund")
	public String toTakeFund(){
		return "takeFound/takeFund";
	}
	/**
	 * 插入提取公积金记录
	 * @param t
	 * @param p
	 * @param takefundmoney
	 * @return
	 */
	@RequestMapping("addTake")
	@ResponseBody
	public String addTakeFund(TakeFund t,Person p,double takefundmoney){
		//takeFoundService.updatePmoney(p,takefundmoney);
		return takeFoundService.addTake(t);
	}
	/**
	 * 日期格式转换
	 * @param binder
	 * @param request
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		
		//转换日期
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
	}
	/**
	 * 转到约定提取界面
	 * @return
	 */
	@RequestMapping("toTakeRepay")
	public String toTakeTapay(){
		return "takeFound/takeRepay";
	}
	/**
	 * 添加约定提取
	 * @param t
	 * @return
	 */
	@RequestMapping("addAgreed")
	@ResponseBody
	public String addAgreed(TakeFund t){
		return takeFoundService.addAgreed(t);
	}
}
