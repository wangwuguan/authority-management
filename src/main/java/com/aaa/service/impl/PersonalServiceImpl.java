package com.aaa.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.PersonalDao;
import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.entity.Person;
import com.aaa.service.PersonalService;
import com.aaa.util.PageUtil;
import com.aaa.util.Records;
@Service
public class PersonalServiceImpl implements PersonalService{
	@Autowired
	private PersonalDao personalDao;
	/**
	 * 添加个人账户(个人开户)
	 */
	@Override
	public void addPersonal(Person person) {
		// TODO Auto-generated method stub
		personalDao.addPersonal(person);
	}
	/**
	 * 查找公司信息
	 */
	@Override
	public PageResult<Map> findCompany(Map<String, Object> map) {
		// TODO Auto-generated method stub
		//对map进行处理
				PageUtil.pageMap(map);
				//创建一个返回类型
				PageResult<Map> userPage = new PageResult<Map>();
				//赋值数据长度
				userPage.setCount(personalDao.getCount(map));
				//赋值数据列表
				userPage.setData(personalDao.findCompany(map));
				return userPage;
	}
	/**
	 * 通过公司账号查找公司信息
	 */
	@Override
	public Company findCompanyByCno(Integer cno) {
		// TODO Auto-generated method stub
		return personalDao.findCompanyByCno(cno);
	}
	/**
	 * 查找个人账户信息
	 */
	@Override
	public PageResult<Map> findPerson(Map<String, Object> map) {
		// TODO Auto-generated method stub
		PageUtil.pageMap(map);
		//创建一个返回类型
		PageResult<Map> userPage = new PageResult<Map>();
		//赋值数据长度
		userPage.setCount(personalDao.getCountPerson(map));
		//赋值数据列表
		userPage.setData(personalDao.findPerson(map));
		return userPage;
	}
	/**
	 * 人员转移修改
	 */
	@Override
	public String updateAcid(Person p) {
		// TODO Auto-generated method stub
		return PageUtil.toResult(personalDao.updateAcid(p));
	}
	/**
	 * 模糊查询中的下拉框
	 */
	@Override
	public List<Map> selectPstateid() {
		// TODO Auto-generated method stub
		return personalDao.selectPstateid();
	}
	/**
	 * 封存启封 修改状态
	 */
	@Override
	public String updatePstateid(Person p) {
		// TODO Auto-generated method stub
		 return PageUtil.toResult(personalDao.updatePstateid(p));
	}
	/**
	 * 销户
	 */
	@Override
	public String destroyPstateid(Person p) {
		// TODO Auto-generated method stub
		return PageUtil.toResult(personalDao.destroyPstateid(p));
	}
	/**
	 *  个人 公司联查 不分页
	 */
	@Override
	public Map findPersonById(Integer pid) {
		// TODO Auto-generated method stub
		return personalDao.findPersonById(pid);
	}
	/**
	 * 查找个人账户  特定状态
	 */
	@Override
	public PageResult<Map> findPersonByPstateid(Map<String, Object> map) {
		// TODO Auto-generated method stub
		PageUtil.pageMap(map);
		//创建一个返回类型
		PageResult<Map> userPage = new PageResult<Map>();
		//赋值数据长度
		userPage.setCount(personalDao.getCountPersonByPstateid(map));
		//赋值数据列表
		userPage.setData(personalDao.findPersonByPstateid(map));
		return userPage;
	}
	/**
	 * 修改个人详情
	 */
	@Override
	public String editdetails(Person p) {
		// TODO Auto-generated method stub
		return PageUtil.toResult(personalDao.editdetails(p));
	}
	
	@Override
	public PageResult<Map> findLoan(Map<String, Object> map) {
		// TODO Auto-generated method stub
		PageUtil.pageMap(map);
		//创建一个返回类型
		PageResult<Map> userPage = new PageResult<Map>();
		//赋值数据长度
		userPage.setCount(personalDao.getCountLoan(map));
		//赋值数据列表
		userPage.setData(personalDao.findLoan(map));
		return userPage;
	}
	

	
	
}
