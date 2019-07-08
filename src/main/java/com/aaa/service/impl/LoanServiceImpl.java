package com.aaa.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.LoanDao;
import com.aaa.entity.Loan;
import com.aaa.entity.PageResult;
import com.aaa.entity.Refund;
import com.aaa.entity.User;
import com.aaa.service.ILoanService;
import com.aaa.util.PageUtil;
import com.aaa.util.RandomNumber;
import com.aaa.util.Records;
import com.aaa.util.SystemConstant;
import com.aaa.util.UserUtil;
/**
 * 
 * 项目名称：AccumulationFund   
 * 类名称：LoanServiceImpl   
 * 类描述：贷款业务层
 * 创建人：
 * 创建时间：2018年12月28日 下午8:57:29   
 *
 */
@Service
@Transactional
public class LoanServiceImpl implements ILoanService {
	/**
	 * 自动注入dao层
	 */
	@Autowired
	private LoanDao loanDao;
	/**
	 * 通过账号获取个人信息
	 */
	@Override
	public Map getPerson(Loan loan) {
		return loanDao.getPerson(loan);
	}
	/**
	 * 添加贷款
	 */
	@Override
	public void addLoan(Loan loan) {
		//获取随机编号
		String lno=RandomNumber.getNum();
		loan.setLno(lno);
		//获取登陆人
		User user = UserUtil.getUser();
		loan.setLname(user.getUname());
		loanDao.addLoan(loan);
		
	}
	
	/**
	 * 初审表查询
	 */
	@Override
	public PageResult<Map> selectLoan(Map map) {
		PageUtil.pageMap(map);
		return 	PageUtil.selectResult(loanDao.selectLoanCount(map), loanDao.selectLoan(map));

	}
	/**
	 * 初审通过
	 */
	@Override
	public int firstPass(Loan loan) {
		Integer i=loanDao.firstPass(loan);
		Map map=new HashMap();
		int pid=loanDao.selectPersonId(loan);
		map.put("pid", pid);
		map.put("rpmsg", "个人初次审核通过");
		//添加操作记录到记录表中，这里的i判断是否成功是在封装类中
	 Records.createPersonCrecords(i, map , SystemConstant.FIRST_REVIEW);
		return i;                                                          
		
	}
	/**
	 * 初审驳回
	 */
	@Override
	public int  firstReject(Loan loan) {
		int i = loanDao.firstReject(loan);
		Map map=new HashMap();
		int pid=loanDao.selectPersonId(loan);
		map.put("pid", pid);
		map.put("rpmsg", "个人初次审核驳回");
		//添加操作记录到记录表中，这里的i判断是否成功是在封装类中
		Records.createPersonCrecords(i, map , SystemConstant.FIRST_REVIEW);
		return i;
		
	}
	
	/**
	 * 复审页面查询
	 */
	@Override
	public PageResult<Map> selectLastCheck(Map<String, Object> map) {
		PageUtil.pageMap(map);
		return 	PageUtil.selectResult(loanDao.selectLastCheckCount(map), loanDao.selectLastCheck(map));

	}
	/**
	 * 复审驳回
	 */
	@Override
	public int lastReject(Loan loan) {
		 int i = loanDao.lastReject(loan);
		Map map=new HashMap();
		int pid=loanDao.selectPersonId(loan);
		map.put("pid", pid);
		map.put("rpmsg", "个人最终审核驳回");
		//添加操作记录到记录表中，这里的i判断是否成功是在封装类中
		Records.createPersonCrecords(i, map , SystemConstant.LAST_REVIEW);
		return i;
	}
	/**
	 * 复审通过操作 
	 * 并且通过工具类方法计算出还款所需的数据，
	 * 然后把数据插入还款表中
	 */
	@Override
	public int lastPass(Loan loan) {
		//查询出贷款的信息
		Loan addRefundByLoan = loanDao.getLoan(loan);
		 Refund refund=new Refund();
		int rallperiods = addRefundByLoan.getLperiods(); //贷款期数
		Double rallmoney = addRefundByLoan.getLmoney(); //贷款总金额
		Double rrate = addRefundByLoan.getLrate();         //贷款利率
		String rpno=addRefundByLoan.getPersonno();   //贷款人的账号
		String rtype=addRefundByLoan.getLrefundtype(); //贷款类型
		Double rmoney=null;   //本月还款总金额
		Double rinterest=null;//本月还款利息
		Double rcapital=null;//本月还款利息
		//判断还款类型
		if(rtype.equals("等额本金")){
			 rmoney=(rallmoney / rallperiods)+(rallmoney*rrate*0.01/12);
		}else if(rtype.equals("等额本息")){
			 rmoney=(rallmoney*rrate*0.01/12*Math.pow((1+rrate/12*0.01),rallperiods))/(Math.pow((1+rrate/12*0.01),rallperiods)-1);		
		}
		rinterest=rallmoney*rrate*0.01/12; 
		rcapital=rmoney-rinterest;
		//给对象赋值
		refund.setRcapital(rcapital);//第一个月还款本金
		refund.setRinterest(rinterest);//第一个月的利息
		refund.setRmoney(rmoney);//第一月还款总金额
		refund.setRtype(rtype);//还款类型
		refund.setRallperiods(rallperiods);//总期数
		refund.setRallmoney(rallmoney);//总贷款金额
		refund.setRrate(rrate);//利率
		refund.setRpno(rpno);//编号
		refund.setRno(RandomNumber.getNum());//随机编号获取
		loanDao.addRefund(refund);//添加还款信息
		int pid=loanDao.selectPersonId(loan);
		Map map=new HashMap();
		map.put("rpmsg", "个人最终审核通过");
		map.put("pid", pid);
		int i = loanDao.lastPass(loan);
		//添加操作记录到记录表中，这里的i判断是否成功是在封装类中
		Records.createPersonCrecords(i, map , SystemConstant.LAST_REVIEW);
		return i;
		
	}
	
	/**
	 * 贷款记录信息
	 */
	@Override
	public PageResult<Map> showLoan(Map<String, Object> map) {
		PageUtil.pageMap(map);
		return 	PageUtil.selectResult(loanDao.showLoanCount(map), loanDao.showLoan(map));

	}
	
	/**
	 * 查询银行
	 */
	@Override
	public List<Map> selectBank() {
		return loanDao.selectBank();
	}
	
	/**
	 * 展示选择的期数
	 */
	@Override
	public List<Map> selectPeriods() {
		return loanDao.selectPeriods();
	}


}
