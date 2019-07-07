package com.aaa.controller;

import com.aaa.entity.PageResult;
import com.aaa.service.IRefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：RefundController   
 * 类描述： 还款控制层
 * 创建人：
 * 创建时间：2019年1月9日 下午8:36:41   
 *
 */
@Controller
@RequestMapping("/refund")
public class RefundController {
	@Autowired
	private IRefundService refundService;
	
	/**
	 * 跳转还款页面
	 * @return
	 */
	@RequestMapping("/toMonthRefund")
	public String toEveryRefund(){
		return "refund/monthRefund";
	}
	
	/**
	 * 月还款信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/everyRefund")
	@ResponseBody
	public PageResult<Map> everyRefund(@RequestParam Map<String,Object> map){
		return refundService.everyRefund(map);
		
	}
	
	/**
	 * 月还款操作
	 * @param map
	 * @return
	 */
	@RequestMapping("/monthRefund")
	public String monthRefund(@RequestParam Map<String,Object> map){
		refundService.monthRefund(map);
		return "redirect:toMonthRefund";
	}
	
	/**
	 * 还款记录查询
	 */
	@RequestMapping("/showHistory")
	@ResponseBody
	public PageResult<Map> showHistory(@RequestParam  Map<String,Object> map){
		return refundService.showHistory(map);
		
	}
	
	/**
	 * 跳转提前还款
	 */
	@RequestMapping("/toBeforehandRefund")
	public String toBeforehandRefund(){
		return "refund/beforehandRefund";
	}
	
	/**
	 * 跳转还款历史页面
	 */
	@RequestMapping("/toSelectRefund")
	public String toSelectRefund(){
		return "refund/selectRefund";
	}
	
	/**
	 * 历史页面查询
	 */
	@RequestMapping("/selectRefund")
	@ResponseBody
	public PageResult<Map> selectRefund(@RequestParam  Map<String,Object> map){
		return refundService.selectRefund(map);
		
	}
	
	/**
	 * 提前还款
	 */
	@RequestMapping("/befundhandRefund")
	@ResponseBody
	public int befundhandRefund(@RequestParam  Map<String,Object> map){
		return refundService.befundhandRefund(map);
		
	}
	
	/**
	 * 提前还款查询本月是否还款
	 */
	@RequestMapping("/selectHistory")
	@ResponseBody
	public int selectHistory(@RequestParam  Map<String,Object> map){
		return refundService.selectHistory(map);
		
	}
}
