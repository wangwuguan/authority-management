package com.aaa.service;

import java.util.Map;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;
import com.aaa.entity.Person;

public interface IRatioService {

	String updateRatio(Company c);

	String updateBaseNum(Person p);

	PageResult<Map> selectPersonPid(Map<String, Object> map);
}
