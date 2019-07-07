package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.service.ICollectionAccountService;
/**
* 项目名称：AccumulationFund   
* 类名称：CollectionAccountController   
* 类描述：财务的controller   
* 创建人：亦谷西农 
* 创建时间：2019年1月21日 下午2:49:41     
* @version
 */

@Controller
@RequestMapping("/CollectionAccount")
public class CollectionAccountController {
	@Autowired
	private ICollectionAccountService icas;
	
	/**
	 * 跳转至页面
	 *2019年1月21日 下午2:49:12
	 */
	@RequestMapping("/toCollectionAccount")
	public String toCollectionAccount(){
		return "finance/collectionAccount";	
	}
	/**
	 * 按年份查询提取金额
	 *2019年1月21日 下午2:53:41
	 */
	@RequestMapping("/searchFundByTime")
	@ResponseBody
	public List<Map> searchFundByTime(@RequestParam Map<String, Object> map){
		System.out.println(map);
		return icas.selFundByTime(map);
		
	}
	/**
	 * 按年份查询公司汇缴金额
	 *2019年1月21日 下午2:53:41
	 */
	@RequestMapping("/searchCompanyMoneyByTime")
	@ResponseBody
	public List<Map> searchCompanyMoneyByTime(@RequestParam Map<String, Object> map){
		System.out.println(map);
		return icas.selCompanyMoneyByTime(map);
		
	}
}
