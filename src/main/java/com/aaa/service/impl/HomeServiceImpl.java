package com.aaa.service.impl;

import com.aaa.dao.HomeDao;
import com.aaa.entity.Company;
import com.aaa.entity.Person;
import com.aaa.service.IHomeService;
import com.aaa.util.PageUtil;
import com.aaa.util.SystemConstant;
import com.aaa.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：HomeService   
 * 类描述：   
 * 创建人：will.Wang
 * 创建时间：2019年1月17日 下午6:46:57       
 */
@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	private HomeDao homeDao;

	/**
	 * 查询所有已经发布的新闻
	 * @return
	 */
	@Override
	public List<Map> selectNews() {
		return homeDao.selectNews();
	}

	/**
	 * 根据新闻id 查询新闻的详细信息
	 * @param map
	 * @return
	 */
	@Override
	public Map selectNewsByNid(Map<String, Object> map) {
		return homeDao.selectNewsByNid(map);
	}

	/**
	 * 个人公积金账号密码校验
	 * @param p
	 * @return
	 */
	@Override
	public String checkPersonalPsd(Person p) {
		//获取当前登陆人信息(个人)
		Person person = UserUtil.getPerson();
		if (p!=null && person!=null && person.getPpassword().equals(p.getPpassword())) {
			return SystemConstant.SUCCESS;
		}
		return SystemConstant.FAIL;
	}
	
	/**
	 * 单位公积金账号密码校验
	 * @param p
	 * @return
	 */
	@Override
	public String checkCompanyPsd(Company c) {
		//获取当前登陆人信息(单位)
		Company company = UserUtil.getCompany();
		if (c!=null && company!=null && company.getCpassword().equals(c.getCpassword())) {
			return SystemConstant.SUCCESS;
		}
		return SystemConstant.FAIL;
	}

	/**
	 * 个人公积金账号密码修改操作
	 * @param p
	 * @return
	 */
	@Override
	public String updatePersonPsd(Map<String, Object> map) {
		//获取当前登录人的信息(编号)
		Person person = UserUtil.getPerson();
		map.put("pid", person.getPid());
		return PageUtil.toResult(homeDao.updatePersonPsd(map));
	}
	
	/**
	 * 单位公积金账号密码修改操作
	 * @param p
	 * @return
	 */
	@Override
	public String updateCompanyPsd(Map<String, Object> map) {
		//获取当前登录人的信息(编号)
		Company company = UserUtil.getCompany();
		map.put("cid", company.getCid());
		return PageUtil.toResult(homeDao.updateCompanyPsd(map));
	}

	

}
