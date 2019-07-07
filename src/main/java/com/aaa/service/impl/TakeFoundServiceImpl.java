package com.aaa.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.TakeFoundDao;
import com.aaa.entity.PageResult;
import com.aaa.entity.Person;
import com.aaa.entity.TakeFund;
import com.aaa.service.ITakeFoundService;
import com.aaa.util.PageUtil;

@Service
public class TakeFoundServiceImpl implements ITakeFoundService{
	@Autowired
	private TakeFoundDao takeFoundDao;
	/**
	 * 插入提取公积金记录
	 */
	@Override
	public String addTake(TakeFund t) {
		// TODO Auto-generated method stub
		return PageUtil.toResult(takeFoundDao.addTake(t));
	}
	/**
	 * 提取后 余额相应减少
	 */
	@Override
	public void updatePmoney(Person p,double takefundmoney) {
		// TODO Auto-generated method stub
		takeFoundDao.updatePmoney(p,takefundmoney);
	}
	/**
	 * 插入约定提取
	 */
	@Override
	public String addAgreed(TakeFund t) {
		// TODO Auto-generated method stub
		return PageUtil.toResult(takeFoundDao.addAgreed(t));
	}
	
	
	
	
}
