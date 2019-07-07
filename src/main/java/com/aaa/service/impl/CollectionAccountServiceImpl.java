package com.aaa.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.CollectionAcocuntDao;
import com.aaa.service.ICollectionAccountService;

@Service
public class CollectionAccountServiceImpl implements ICollectionAccountService {
	@Autowired
	private CollectionAcocuntDao cao;
	/**
	 * 根据日期查询个人提取公积金数量
	 *2019年1月21日 下午9:25:54
	 */
	public List<Map> selFundByTime(Map<String, Object> map){
		System.out.println(cao.selFundByTime(map));
		return cao.selFundByTime(map);
	}
	/**
	 * 根据日期查询公司汇缴钱数
	 *2019年1月21日 下午9:26:34
	 */
	public List<Map> selCompanyMoneyByTime(Map<String, Object> map){
		System.out.println(cao.selCompanyMoneyByTime(map));
		return cao.selCompanyMoneyByTime(map);	
	}
}
