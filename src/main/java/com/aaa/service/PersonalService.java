package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.entity.Person;

public interface PersonalService {
	/**
	 * 添加个人开户信息
	 * @param person
	 */
	void addPersonal(Person person);
	/**
	 * 查找公司
	 * @param company
	 * @return
	 */
	PageResult<Map> findCompany(Map<String,Object> map);
	
	/**
	 * 根据cno选择公司
	 * @param cno
	 * @return
	 */
	Company findCompanyByCno(Integer cno);
	
	/**
	 * 查找个人账户
	 * @param map
	 * @return
	 */
	PageResult<Map> findPerson(Map<String,Object> map);
	/**
	 * 人员转移
	 * @param p
	 * @return
	 */
	String updateAcid(Person p);
	/**
	 * 模糊查询中的下拉框
	 * @return
	 */
	List<Map> selectPstateid();
	/**
	 * 封存启封 修改状态
	 * @param p
	 * @return
	 */
	String updatePstateid(Person p);
	/**
	 * 销户
	 * @param p
	 * @return
	 */
	String destroyPstateid(Person p);
	/**
	 * 个人 公司联查 不分页
	 * @param cid
	 * @return
	 */
	Map findPersonById(Integer pid);
	/**
	 * 查找个人账户  特定状态
	 * @param map
	 * @return
	 */
	PageResult<Map> findPersonByPstateid(Map<String,Object> map);
	/**
	 * 修改个人详情
	 * @param p
	 * @return
	 */
	String editdetails(Person p);
	/**
	 * 查找贷款人 个人账户
	 * @param map
	 * @return
	 */
	PageResult<Map> findLoan(Map<String,Object> map);
	

}
