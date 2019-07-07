package com.aaa.controller;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.entity.Person;
import com.aaa.service.ICompanyService;
import com.aaa.service.IHomeService;
import com.aaa.service.IRemitService;
import com.aaa.service.PersonalService;
import com.aaa.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：HomeController   
 * 类描述： 前台操作  
 * 创建人：王鹏翔  
 * 创建时间：2019年1月17日 下午3:19:25       
 */
@Controller
@RequestMapping("front")
public class HomeController {
	
	@Autowired
	private IHomeService homeService;
	
	@Autowired
	private PersonalService personalService;
	
	@Autowired
	private ICompanyService comService;
	
	@Autowired
	private IRemitService reService;
	
	/**
	 * 跳转到前台首页
	 * @return
	 */
	@RequestMapping("toFrontMain")
	public String toFrontMain() {
		return "front/home";
	}
	
	/**
	 * 跳转到新闻页面
	 * @return
	 */
	@RequestMapping("toNews")
	public String toNews() {
		return "front/news";
	}
	
	/**
	 * 查询新闻
	 * @return
	 */
	@RequestMapping("selectNews")
	@ResponseBody
	public List<Map> selectNews() {
		return homeService.selectNews();
	}
	
	/**
	 * 跳转到新闻详情页
	 * @return
	 */
	@RequestMapping("toNewsDetail")
	public String toNewsDetail(@RequestParam Map<String,Object> map,Model model) {
		model.addAttribute("news",homeService.selectNewsByNid(map));
		return "front/newsDetail";
	}
	
	/**
	 * 查询个人详细信息
	 * @return
	 */
	@RequestMapping("personalInformation")
	public String personalInformation(Model model) {
		Person person = UserUtil.getPerson();
		model.addAttribute("person",personalService.findPersonById(person.getPid()));
		return "personal/personInfo";
	}
	
	/**
	 * 查询单位详细信息
	 * @return
	 */
	@RequestMapping("companyInformation")
	public String companyInformation(Model model) {
		Company company = UserUtil.getCompany();
		model.addAttribute("company",comService.selectCompanyInfoById(company.getCid()));
		return "company/companyInfo";
	}
	
	/**
	 * 跳转到个人公积金账号密码修改页面
	 * @return
	 */
	@RequestMapping("toUpdatePersonPsd")
	public String toUpdatePersonPsd() {
		return "front/updatePersonPsd";
	}
	
	/**
	 * 跳转到单位公积金账号密码修改页面
	 * @return
	 */
	@RequestMapping("toUpdateCompanyPsd")
	public String toUpdateCompanyPsd() {
		return "front/updateCompanyPsd";
	}
	
	/**
	 * 个人公积金账号原密码校验
	 * @return
	 */
	@RequestMapping("checkPersonalPsd")
	@ResponseBody
	public String checkPersonalPsd(Person p) {
		return homeService.checkPersonalPsd(p);
	}
	
	/**
	 * 单位公积金账号原密码校验
	 * @return
	 */
	@RequestMapping("checkCompanyPsd")
	@ResponseBody
	public String checkCompanyPsd(Company c) {
		return homeService.checkCompanyPsd(c);
	}
	
	/**
	 * 个人公积金账号密码修改操作
	 * @return
	 */
	@RequestMapping("updatePersonPsd")
	@ResponseBody
	public String updatePersonPsd(@RequestParam Map<String, Object> map) {
		return homeService.updatePersonPsd(map);
	}
	
	/**
	 * 单位公积金账号密码修改操作
	 * @return
	 */
	@RequestMapping("updateCompanyPsd")
	@ResponseBody
	public String updateCompanyPsd(@RequestParam Map<String, Object> map) {
		return homeService.updateCompanyPsd(map);
	}
	
	/**
	 * 跳转到单位详情页面
	 * @return
	 */
	@RequestMapping("toCompanyDetails")
	public String toCompanyDetails() {
		return "front/companyDetails";
	}
	
	/**
	 * 明细查询
	 */
	@RequestMapping("/selectCompanyDetails")
	@ResponseBody
	public PageResult<Map> selectCompanyDetails(@RequestParam Map<String,Object> map) {
		map.put("cdno", UserUtil.getCompany().getCno());
		return reService.selectCompanyDetail(map);
	}

}
