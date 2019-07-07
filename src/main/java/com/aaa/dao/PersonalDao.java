package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Company;
import com.aaa.entity.Person;

public interface PersonalDao {
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
	List<Map> findCompany(Map<String,Object> map);
	
	/**
	 * @return
	 */
	Integer getCount(Map<String,Object> map);
	
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
	List<Map> findPerson(Map<String,Object> map);
	/**
	 * 查找个人账户的模糊查询
	 * @param map
	 * @return
	 */
	Integer getCountPerson(Map<String,Object> map);
	/**
	 * 人员转移
	 * @param p
	 * @return
	 */
	int updateAcid(Person p);
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
	int updatePstateid(Person p);
	/**
	 * 销户
	 * @param p
	 * @return
	 */
	int destroyPstateid(Person p);
	/**
	 * 个人 公司联查 不分页
	 * @param cid
	 * @return
	 */
	Map findPersonById(Integer pid);
	/**
	 * 查找个人账户
	 * @param map
	 * @return
	 */
	List<Map> findPersonByPstateid(Map<String,Object> map);
	/**
	 * 查找个人账户的模糊查询
	 * @param map
	 * @return
	 */
	Integer getCountPersonByPstateid(Map<String,Object> map);
	/**
	 * 修改个人详情
	 * @param p
	 * @return
	 */
	int editdetails(Person p);
	/**
	 * 查找贷款人 个人账户
	 * @param map
	 * @return
	 */
	List<Map> findLoan(Map<String,Object> map);
	/**
	 * 查找贷款人 个人账户的模糊查询
	 * @param map
	 * @return
	 */
	Integer getCountLoan(Map<String,Object> map);
}
