package com.aaa.service;

import java.util.Map;

import com.aaa.entity.PageResult;
import com.aaa.entity.Person;
import com.aaa.entity.TakeFund;

public interface ITakeFoundService {
	/**
	 * 插入提取公积金记录
	 * @param t
	 * @return
	 */
	String addTake(TakeFund t);
	/**
	 * 提取后 余额相应减少
	 * @param p
	 * @param takefundmoney
	 */
	void updatePmoney(Person p,double takefundmoney);
	/**
	 * 插入约定提取
	 * @param t
	 * @return
	 */
	String addAgreed(TakeFund t);
}
