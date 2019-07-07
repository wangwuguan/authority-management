package com.aaa.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.RatioDao;
import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.entity.Person;
import com.aaa.service.IRatioService;
import com.aaa.util.PageUtil;

@Service
public class RatioServiceImpl implements IRatioService{
	@Autowired
	private RatioDao raDao;
	/**
	 * 修改比例
	 * @param c
	 * @return
	 */
	@Override
	public String updateRatio(Company c) {
		//修改比例
		int i = raDao.updateRatio(c);
		//修改个人缴存金额和公司缴存金额
		raDao.updateBaseNumCounts();
		return PageUtil.toResult(i);
	}

	@Override
	public String updateBaseNum(Person p) {
		int i=raDao.updateBaseNum(p);
		//修改个人缴存金额和公司缴存金额
		raDao.updateBaseNumCounts();
		return PageUtil.toResult(i);
	}

	@Override
	public PageResult<Map> selectPersonPid(Map<String, Object> map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//创建一个返回类型
		PageResult<Map> userPage = new PageResult<Map>();
		//赋值数据长度
		userPage.setCount(raDao.getCount(map));
		//赋值数据列表
		userPage.setData(raDao.selectPersonPid(map));
		
		return userPage;
	}
}
