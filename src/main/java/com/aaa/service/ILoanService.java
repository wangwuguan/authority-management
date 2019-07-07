package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Loan;
import com.aaa.entity.PageResult;
import com.aaa.entity.Person;

/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：ILoanService   
 * 类描述：   贷款业务层接口
 * 创建人：陈延铠
 * 创建时间：2018年12月28日 下午8:53:15   
 *
 */
public interface ILoanService {
	
	Map getPerson(Loan loan);

	void addLoan(Loan loan);

	PageResult<Map> selectLoan(Map map);

	int firstPass(Loan loan);

	int firstReject(Loan loan);

	PageResult<Map> selectLastCheck(Map<String, Object> map);

	int lastPass(Loan loan);

	int lastReject(Loan loan);

	PageResult<Map> showLoan(Map<String, Object> map);

	List<Map> selectBank();

	List<Map> selectPeriods();

}
