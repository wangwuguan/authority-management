package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Company;
import com.aaa.entity.Person;

public interface RatioDao {
	
	int updateRatio(Company c);
	
	int updateBaseNum(Person p);

	int getCount(Map<String, Object> map);

	List<Map> selectPersonPid(Map<String, Object> map);

	int updateBaseNumCounts();
}
