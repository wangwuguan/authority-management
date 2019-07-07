package com.aaa.controller;

import com.aaa.entity.Loan;
import com.aaa.entity.PageResult;
import com.aaa.service.ILoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：LoanController   
 * 类描述： 贷款业务控制层
 * 创建人：
 * 创建时间：2018年12月28日 下午8:50:06   
 *
 */
@Controller
@RequestMapping("/loan")
public class LoanController {
		/**
		 * 自动注入贷款业务层
		 */
		@Autowired
		private ILoanService loanService;
		
		/**
		 * 跳转个人贷款页面
		 * @return
		 */
		@RequestMapping("/toAddLoan")
			public String toAddLoan(){
				return "loan/addLoan";
			}
		
		/**
		 * 个人账号的信息获取
		 * @param loan 
		 * @return 个人账号信息
		 */
		@RequestMapping("/getPerson")
		@ResponseBody
		public Map getPerson(Loan loan){
			return loanService.getPerson(loan);		
		}
		
		/**
		 * 个人贷款申请
		 * @param loan
		 */
		@RequestMapping("/addLoan")
		public String addLoan(Loan loan){
			loanService.addLoan(loan);
			return "redirect:toAddLoan";
		}
		
		/**
		 * 跳转审核页面
		 * @return
		 */
		@RequestMapping("/toCheck")
		public String toCheck(){
			return "loan/checkLoan";
		}
		
		/**
		 * 查询全部未初审核贷款
		 * @return
		 */
		@RequestMapping("/selectLoan")
		@ResponseBody
		public PageResult<Map> selectLoan(@RequestParam Map<String,Object> map){
			return loanService.selectLoan(map);
			
		}
		
		/**
		 * 初审通过
		 * @param loan
		 * @return
		 */
		@RequestMapping("/firstPass")
		@ResponseBody
		public String firstPass(Loan loan){
			loanService.firstPass(loan);
			return null;
			
		}
		
		/**
		 * 初审驳回
		 * @param loan
		 * @return
		 */
		@RequestMapping("/firstReject")
		@ResponseBody
		public int firstReject(Loan loan){
			return loanService.firstReject(loan);
			
		}
		/**
		 * 跳转复审
		 * @return
		 */
		@RequestMapping("toLastCheck")
		public String toLastCheck(){
			return "loan/lastCheck";
		}
		/**
		 * 复审页面信息查询
		 */
		@RequestMapping("/selectLastCheck")
		@ResponseBody
		public PageResult<Map> selectLastCheck(@RequestParam Map<String,Object> map){
			return loanService.selectLastCheck(map);
		}
		/**
		 * 复审通过
		 * @param loan
		 * @return
		 */
		@RequestMapping("/lastPass")
		@ResponseBody
		public int lastPass(Loan loan){	
			return loanService.lastPass(loan);
			
		}
		/**
		 * 复审驳回
		 * @param loan
		 * @return
		 */
		@RequestMapping("/lastReject")
		@ResponseBody
		public int lastReject(Loan loan){
			return loanService.lastReject(loan);		
		}
		
		/**
		 * 跳转贷款记录页面
		 */
		@RequestMapping("/toShowLoan")
		public String toShowLoan(){
			return "loan/showLoan";
		}
		/**
		 * 贷款记录页面
		 */
		@RequestMapping("/showLoan")
		@ResponseBody
		public PageResult<Map> showLoan(@RequestParam Map<String,Object> map){
			return loanService.showLoan(map);
		}
		
		/**
		 * 添加时展示银行
		 */
		@RequestMapping("/selectBank")
		@ResponseBody
		public List<Map> selectBank(){
			return loanService.selectBank();
			
		}
		
		/**
		 * 展示选择的期数
		 */
		@RequestMapping("/selectPeriods")
		@ResponseBody
		public List<Map> selectPeriods(){
			return loanService.selectPeriods();
			
		}
	}
