package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.entity.Role;

public interface CompanyDao {
	
	int updateCompany(Company c);
	
	int insertCompany(Company c);

	int getCount(Map map);

	List<Map> selectCompany(Map<String, Object> map);

	Company selectCompanyInfoById(Integer cid);

	Integer selectCompanyMaxCno();

	Company selectInstitution(Map<String, Object> map);
	
	List<Map> selectCompanys(Map<String, Object> map);
	
	int insertCompanys(Company c);
	
	int getCounts(Map map);
}