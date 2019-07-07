package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;

public interface ICompanyService {
	
	int updateCompany(Company c);
	
	int insertCompany(Company c);
	
	PageResult<Map> selectCompany(Map<String, Object> map);

	Company selectCompanyInfoById(Integer id);

	String selectInstitution(Map<String, Object> map);
	
	PageResult<Map> selectCompanys(Map<String, Object> map);
} 
