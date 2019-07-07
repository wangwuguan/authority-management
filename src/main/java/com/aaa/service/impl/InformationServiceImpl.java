package com.aaa.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.InformationDao;
import com.aaa.entity.PageResult;
import com.aaa.entity.Person;
import com.aaa.entity.User;
import com.aaa.service.IinformationService;
import com.aaa.util.PageUtil;
import com.aaa.util.Records;
import com.aaa.util.SystemConstant;
import com.aaa.util.UserUtil;

/**      
 * 项目名称：AccumulationFund   
 * 类名称：InformationService   
 * 类描述：   
 * 创建人：王鹏翔  
 * 创建时间：2019年1月8日 下午9:02:30       
 */
@Service
public class InformationServiceImpl implements IinformationService {
	
	@Autowired
	private InformationDao inDao;

	/**
	 * 修改个人公积金账号信息
	 * @param p
	 * @return
	 */
	@Override
	public String updatePerson(Map<String,Object> map) {
		Integer i = inDao.updatePerson(map);
		//修改个人公积金账号信息并生成日志信息
		return Records.createPersonCrecords(i, map, SystemConstant.INFORMATION_UPDATE);
	}

	/**
	 * 修改单位公积金账号信息
	 * @param map
	 * @return
	 */
	@Override
	public String updateCompany(Map<String, Object> map) {
		Integer i = inDao.updateCompany(map);
		//修改单位公积金账号信息并生成日志信息
		return Records.createCompanyCrecords(i, map, SystemConstant.INFORMATION_UPDATE);
	}
	
	/**
	 * 查询单位信息日志记录
	 * @param map
	 * @return
	 */
	@Override
	public PageResult<Map> selectCompanyCrecords(Map<String, Object> map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//返回数据
		return PageUtil.selectResult(inDao.getCompanyCrecordsCount(map), inDao.selectCompanyCrecords(map));	
	}
	
	/**
	 * 查询个人信息日志记录
	 * @param map
	 * @return
	 */
	@Override
	public PageResult<Map> selectPersonCrecords(Map<String, Object> map) {
		//对map进行处理
		PageUtil.pageMap(map);
		//返回数据
		return PageUtil.selectResult(inDao.getPersonCrecordsCount(map), inDao.selectPersonCrecords(map));	
	}
}
