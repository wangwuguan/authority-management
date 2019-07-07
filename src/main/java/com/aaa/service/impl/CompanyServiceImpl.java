package com.aaa.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.CompanyDao;
import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.entity.Role;
import com.aaa.entity.User;
import com.aaa.service.ICompanyService;
import com.aaa.util.PageUtil;
import com.aaa.util.SystemConstant;
import com.aaa.util.UserUtil;
@Service
public class CompanyServiceImpl implements ICompanyService{
	@Autowired
	private CompanyDao comDao;
	
	@Override
	public int updateCompany(Company c) {
		// TODO Auto-generated method stub
		return comDao.updateCompany(c);
	}
	
	/**
	 * 查询出单位账号的最大值加一
	 * @return
	 */
	private Integer selectCompanyMaxCno() {
		return comDao.selectCompanyMaxCno(); 
	}

	@Override
	public int insertCompany(Company c) {
		// TODO Auto-generated method stub
		c.setCno(selectCompanyMaxCno().toString());
		//获取当前操作人id
		c.setUserid(UserUtil.getUser().getUid());
		comDao.insertCompanys(c);
		return comDao.insertCompany(c);
	}

	@Override
	public PageResult<Map> selectCompany(Map<String,Object> map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//创建一个返回类型
		return PageUtil.selectResult(comDao.getCount(map),comDao.selectCompany(map));
	}

	@Override
	public Company selectCompanyInfoById(Integer id) {
		return comDao.selectCompanyInfoById(id);
	}

	@Override
	public String selectInstitution(Map<String, Object> map) {
		Company com = comDao.selectInstitution(map);
		System.out.println(com);
		if (com==null) {
			//没有存在的名称
			return SystemConstant.SUCCESS;
		}
		return SystemConstant.FAIL;
	}
	@Override
	public PageResult<Map> selectCompanys(Map<String,Object> map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//创建一个返回类型
		return PageUtil.selectResult(comDao.getCounts(map),comDao.selectCompanys(map));
	}

	
}
