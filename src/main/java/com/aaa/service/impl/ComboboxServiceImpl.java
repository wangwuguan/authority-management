package com.aaa.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ComboboxDao;
import com.aaa.entity.PageResult;
import com.aaa.service.IComboboxService;
@Service
public class ComboboxServiceImpl implements IComboboxService{
	@Autowired
	private ComboboxDao boxDao;

	@Override
	public List<Map> selectCertificate() {
		
		return boxDao.selectCertificate();
	}

	@Override
	public List<Map> selectCompanyType() {
		// TODO Auto-generated method stub
		return boxDao.selectCompanyType();
	}

	@Override
	public List<Map> selectIndustry() {
		// TODO Auto-generated method stub
		return boxDao.selectIndustry();
	}

	@Override
	public List<Map> selectRelation() {
		// TODO Auto-generated method stub
		return boxDao.selectRelation();
	}

	@Override
	public List<Map> selectEconomicType() {
		// TODO Auto-generated method stub
		return boxDao.selectEconomicType();
	}

	@Override
	public List<Map> selectBank() {
		// TODO Auto-generated method stub
		return boxDao.selectBank();
	}

	@Override
	public List<Map> selectDegree() {
		// TODO Auto-generated method stub
		return boxDao.selectDegree();
	}

	@Override
	public List<Map> selectFund() {
		// TODO Auto-generated method stub
		return boxDao.selectFund();
	}

	@Override
	public List<Map> selectAgreedTime() {
		// TODO Auto-generated method stub
		return boxDao.selectAgreedTime();
	}
}
