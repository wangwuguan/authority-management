package com.aaa.controller;

import com.aaa.entity.PageResult;
import com.aaa.entity.Person;
import com.aaa.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
/**
 * 个人开户
 * @author
 * @时间: 2018年12月29日
 */
@Controller
@RequestMapping("personal")
public class PersonalController {
	@Autowired
	private PersonalService personalService;
	/**
	 * 到添加页面
	 * @return
	 */
	@RequestMapping("/toAddPersonal")
	public String toAddPersonal(){
		return "personal/addPersonal";
	}
	/**
	 * 添加个人开户信息
	 * @param person
	 */
	@RequestMapping("addPersonal")
	public void insertPersonal(Person person){
		personalService.addPersonal(person);
	}
	/**
	 * 转到查找公司
	 */
	@RequestMapping("toFindCom")
	public String toFindCom(){
		return "personal/findCompany";
	}
	/**
	 * 查找公司信息
	 * @param company
	 */
	@RequestMapping("findCompany")
	@ResponseBody
	public  PageResult<Map> findCompany(@RequestParam Map<String,Object> map){
		 return personalService.findCompany(map);
	}
	/**
	 * 根据公司账户查找公司
	 * @param cno
	 */
	@RequestMapping("findCompanyByCno")
	@ResponseBody
	public void findCompanyByCno(Integer cno){
		personalService.findCompanyByCno(cno);
	}
	/**
	 * 转到个人转移页面
	 * @return
	 */
	@RequestMapping("toPersonTransfer")
	public String toPersonTransfer(){
		return "personal/personTransfer";
	}
	/**
	 * 转到查找个人账户信息页面
	 * @return
	 */
	@RequestMapping("toFindPerson")
	public String toFindPerson(){
		return "personal/findPerson";
	}
	/**
	 * 查找个人账户
	 * @param map
	 * @return
	 */
	@RequestMapping("findPerson")
	@ResponseBody
	public PageResult<Map> findPerson(@RequestParam Map<String,Object> map){
		return personalService.findPerson(map);
	}
	/**
	 * 人员转移
	 * @param p
	 * @return
	 */
	@RequestMapping("updateAcid")
	@ResponseBody
	public String updateAcid(Person p){
		return personalService.updateAcid(p);
	}
	/**
	 * 转到封存 页面
	 * @return
	 */
	@RequestMapping("toShowSeal")
	public String toShowSeal(){
		return "personal/showSeal";
	}
	
	@RequestMapping("selectPstateid")
	@ResponseBody
	public List<Map> selectPstateid(){
		return personalService.selectPstateid();
	}
	/**
	 * 封存启封 修改状态
	 * @param p
	 * @return
	 */
	@RequestMapping("updatePstateid")
	@ResponseBody
	public String updatePstateid(Person p){
		 return personalService.updatePstateid(p);
	}
	/**
	 * 销户
	 * @param p
	 * @return
	 */
	@RequestMapping("destroyPstateid")
	@ResponseBody
	public String destroyPstateid(Person p){
		return personalService.destroyPstateid(p);
	}
	/**
	 * 跳转查看详情页面
	 */
	@RequestMapping("toFindPersonById")
	public String toCompanyInfoById(Integer pid,Model model){
		//System.out.println(personalService.findPersonById(pid);
		model.addAttribute("person",personalService.findPersonById(pid));
		return "personal/personInfo";
	}
	/**
	 * 跳转个人开户记录页面
	 * @return
	 */
	@RequestMapping("toPersonalRecord")
	public String toPersonalRecord(){
		return "personal/personalRecord";
	}
	/**
	 * 跳转明细查询页面
	 * @return
	 */
	@RequestMapping("toSearchDetails")
	public String toSearchDetails(){
		return "personal/searchDetails";
	}
	/**
	 * 跳转冲缴记录页面
	 * @return
	 */
	@RequestMapping("toPayRecord")
	public String toPayRecord(){
		return "personal/payRecord";
	}
	
	/**
	 * 查找个人账户  特定状态
	 * @param map
	 * @return
	 */
	@RequestMapping("findPersonByPstateid")
	@ResponseBody
	public PageResult<Map> findPersonByPstateid(@RequestParam Map<String,Object> map){
		return personalService.findPersonByPstateid(map);
	}
	/**
	 * 修改详情
	 * @param p
	 * @return
	 */
	@RequestMapping("editDetails")
	@ResponseBody
	public String editDetails(Person p){
		return personalService.editdetails(p);
	}
	/**
	 * 查找借贷的个人账户
	 * @param map
	 * @return
	 */
	@RequestMapping("findLoan")
	@ResponseBody
	public PageResult<Map> findLoan(@RequestParam Map<String,Object> map){
		return personalService.findLoan(map);
	}
}
