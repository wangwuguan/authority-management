package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;

public interface RemitDao {

	List<Map> selectCompanyInfo(Map<String, Object> map);

	int updateCbalanc(Map<String,Object> map);
	
	Integer selectCompanyCputsno();

	int updateShowRemit(Map<String,Object> map);

	int getCount(Map<String, Object> map);

	int updatePersonRemit(Map<String,Object> map);

	List<Map> selectCompanyPayment(Map<String, Object> map);
	
	int insertCompanyDerail(Map map);
	
	String selectCbalanc(Map map);
	
	List<Map> selectCompanyDetail(Map<String, Object> map);
	
	int getCounts(Map<String, Object> map);
	
	
}
