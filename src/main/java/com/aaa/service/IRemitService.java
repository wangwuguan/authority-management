package com.aaa.service;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.aaa.entity.Company;
import com.aaa.entity.PageResult;

public interface IRemitService {

	PageResult<Map> selectCompanyInfo(Map<String, Object> map);

	String updateCbalanc(Map<String,Object> map);

	String updateShowRemit(Map<String,Object> map);

	PageResult<Map> selectCompanyPayment(Map<String, Object> map);

	PageResult<Map> selectCompanyDetail(Map<String, Object> map);

	String updateShowPayment(Map<String, Object> map);
}
