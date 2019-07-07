package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.PageResult;

public interface IComboboxService {

	List<Map> selectCertificate();

	List<Map> selectCompanyType();

	List<Map> selectIndustry();

	List<Map> selectRelation();

	List<Map> selectEconomicType();

	List<Map> selectBank();
	
	List<Map> selectDegree();
	
	List<Map> selectFund();
	
	List<Map> selectAgreedTime();
}
