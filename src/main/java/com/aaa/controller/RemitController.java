package com.aaa.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.service.IRemitService;

@Controller
@RequestMapping("remit")
public class RemitController {
	@Autowired
	private IRemitService reService;
	
	/**
	 * 跳转汇缴办理
	 */
	@RequestMapping("/toShowRemit")
	public String toShowRemit(){
		return "remit/showRemit";
	}
	/**
	 * 跳转冲缴办理                                                                                                                                                                                                                                                                                                                                                              
	 */
	@RequestMapping("/toShowRushRemit")
	public String toShowRushRemit(){
		return "remit/rushRemit";
	}
	/**
	 * 跳转补缴办理Payment                                                                                                                                                                                                                                                                                                                                                                
	 */
	@RequestMapping("/toPaymentRemit")
	public String toPaymentRemit(){
		return "company/paymentRemit";
	}
	/**
	 * 查询公司开户记录
	 */
	@RequestMapping("/selectCompanyInfo")
	@ResponseBody
	public PageResult<Map> selectCompanyInfo(@RequestParam Map<String,Object> map) {
		return reService.selectCompanyInfo(map);
	} 
	/**
	 * 添加冲缴金额
	 */
	@RequestMapping("/updateCbalanc")
	@ResponseBody
	public String updateCbalanc(@RequestParam Map<String,Object> map){
		return reService.updateCbalanc(map);
	}
	/**
	 * 汇缴办理提交
	 */
	@RequestMapping("/updateShowRemit")
	@ResponseBody
	public String updateShowRemit(@RequestParam Map<String,Object> map){
		return reService.updateShowRemit(map);
	}
	/**
	 * 补缴办理提交
	 */
	@RequestMapping("/updateShowPayment")
	@ResponseBody
	public String updateShowPayment(@RequestParam Map<String,Object> map){
		return reService.updateShowPayment(map);
	}
	
	/**
	 * 查询需要补缴的人
	 */
	@RequestMapping("/selectCompanyPayment")
	@ResponseBody
	public PageResult<Map> selectCompanyPayment(@RequestParam Map<String,Object> map) {
		return reService.selectCompanyPayment(map);
	}
	/**
	 * 明细查询
	 */
	@RequestMapping("/selectCompanyDetail")
	@ResponseBody
	public PageResult<Map> selectCompanyDetail(@RequestParam Map<String,Object> map) {
		return reService.selectCompanyDetail(map);
	}
	
}
                                             