package com.aaa.service;

import java.util.Map;

import com.aaa.entity.PageResult;

public interface IRefundService {

	PageResult<Map> everyRefund(Map<String, Object> map);

	void monthRefund(Map<String, Object> map);

	PageResult<Map> showHistory(Map<String, Object> map);

	PageResult<Map> selectRefund(Map<String, Object> map);

	int befundhandRefund(Map<String, Object> map);

	int selectHistory(Map<String, Object> map);

}
